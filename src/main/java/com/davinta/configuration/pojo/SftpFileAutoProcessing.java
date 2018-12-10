package com.davinta.configuration.pojo;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SftpFileAutoProcessing extends CrudRepository<LoanRepaymentBankFileDetails, Date> {

	List<LoanRepaymentBankFileDetails> findByCreatedDateGreaterThanEqualAndRequestStatusOrderByLoanRepaymentBankFileDetailsAsc(Date createdDate,int requestStatus);
}
