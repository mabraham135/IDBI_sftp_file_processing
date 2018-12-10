package com.davinta.configuration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.davinta.configuration.pojo.LoanRepaymentBankFileDetails;
import com.davinta.configuration.pojo.SftpFileAutoProcessing;

@RestController
@PropertySource(value = {"classpath:config.properties"})
public class SftpFileProcessingController {
	@Autowired
	SftpFileAutoProcessing sftpFileAutoProcessing;
	@Value("${filepath}")
    private String filepath;
	
	@Value("${numOfdays.interval}")
    private int numOfDays;
	
	private static final Logger logger = LogManager.getLogger(SftpFileProcessingController.class.getName());

	@RequestMapping(method = RequestMethod.GET, value = "/api/sftpFileAutoProcessing")
	public void sftpBatchFileReprocessing() {
		String time =readFile();
		if(!StringUtils.isEmpty(time)) {
			logger.info("TIme : "+time);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		long milliSecondsFromFile= Long.parseLong(time);
		calendar.setTimeInMillis(milliSecondsFromFile);
		logger.info("Converted Time :"+dateFormat.format(calendar.getTime())); 
		List<LoanRepaymentBankFileDetails> list = sftpFileAutoProcessing
				.findByCreatedDateGreaterThanEqualAndRequestStatusOrderByLoanRepaymentBankFileDetailsAsc(getPreviousDate(), 1);
		LoanRepaymentBankFileDetails firstRecord = null;
		long millis = 0;
		if(list.size()>0) {
			firstRecord=list.get(0);
			millis=firstRecord.getCreatedDate().getTime();
			logger.info(firstRecord.getFileName() + " -- " + firstRecord.getCreatedDate() + "Created date in millis "+millis+" filepath"+filepath);
		}else {
			logger.error("No Data found");
		}
		
		if(millis!=0 && millis<milliSecondsFromFile) {
			try {
				File fileWrite = new File(filepath);
				FileWriter writeFile =new FileWriter(fileWrite,false);
				writeFile.write(Long.toString(millis));
				writeFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

	public Date getPreviousDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, numOfDays);
		cal.set(Calendar.MILLISECOND, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.HOUR, 0);
		Date todate = cal.getTime();
		logger.info("Date    : " + todate);
		return todate;
	}

	public String readFile() {
		String line = null;
		try {
			File file = new File(filepath);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}
}
