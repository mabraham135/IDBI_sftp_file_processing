package com.davinta.configuration.pojo;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class LoanRepaymentBankFileDetails.
 *
 * @author Hibernate CodeGenerator
 */
@Entity
public class LoanRepaymentBankFileDetails {
	
	 @Id
	private Long loanRepaymentBankFileDetails;
	
	/** persistent field. */
	private String bankAccountNumber;
	
	/** persistent field. */
	private String solId;
	
	/** persistent field. */
	private String drCr;
	
	/** persistent field. */
	private double repaymentAmount;
	
	/** persistent field. */
	private Date repaymentDate;
	
	/** persistent field. */
	private String particulars;
	
	/** persistent field. */
	private int requestStatus;
	
	/** persistent field. */
	private String fileName;
	
	/** persistent field. */
	private int fileSequenceNo;
	
	/** persistent field. */
    private String createdBy;

    /** persistent field. */
    private Date createdDate;
    
    /** persistent field. */
    private Date updatedDate;

    /** persistent field. */
    private String updatedBy;
    
    /** The meeting no. */
    private Integer meetingNo;
    
    /** The channel type. */
    private String channelType;
	
	/** The group code. */
	private String groupCode;
	
	/** The meeting time. */
	private Date meetingTime;
	
	/** The penalty charged. */
	private Double penaltyCharged;
	
	/** The penalty waved off. */
	private Double penaltyWavedOff;
		
	/**
	 * Gets the meeting no.
	 *
	 * @return the meeting no
	 */
	public Integer getMeetingNo() {
		return meetingNo;
	}

	/**
	 * Sets the meeting no.
	 *
	 * @param meetingNo the new meeting no
	 */
	public void setMeetingNo(Integer meetingNo) {
		this.meetingNo = meetingNo;
	}

	/**
	 * Gets the channel type.
	 *
	 * @return the channel type
	 */
	public String getChannelType() {
		return channelType;
	}

	/**
	 * Sets the channel type.
	 *
	 * @param channelType the new channel type
	 */
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	/**
	 * Gets the group code.
	 *
	 * @return the group code
	 */
	public String getGroupCode() {
		return groupCode;
	}

	/**
	 * Sets the group code.
	 *
	 * @param groupCode the new group code
	 */
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	/**
	 * Gets the meeting time.
	 *
	 * @return the meeting time
	 */
	public Date getMeetingTime() {
		return meetingTime;
	}

	/**
	 * Sets the meeting time.
	 *
	 * @param meetingTime the new meeting time
	 */
	public void setMeetingTime(Date meetingTime) {
		this.meetingTime = meetingTime;
	}

	/**
	 * Gets the loan repayment bank file id.
	 *
	 * @return the loan repayment bank file id
	 */
	public Long loanRepaymentBankFileDetails() {
		return loanRepaymentBankFileDetails;
	}

	/**
	 * Sets the loan repayment bank file id.
	 *
	 * @param loanRepaymentBankFileId the new loan repayment bank file id
	 */
	public void setloanRepaymentBankFileDetails(Long loanRepaymentBankFileDetails) {
		this.loanRepaymentBankFileDetails = loanRepaymentBankFileDetails;
	}

	/**
	 * Gets the bank account number.
	 *
	 * @return the bank account number
	 */
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	/**
	 * Sets the bank account number.
	 *
	 * @param bankAccountNumber the new bank account number
	 */
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	/**
	 * Gets the sol id.
	 *
	 * @return the sol id
	 */
	public String getSolId() {
		return solId;
	}

	/**
	 * Sets the sol id.
	 *
	 * @param solId the new sol id
	 */
	public void setSolId(String solId) {
		this.solId = solId;
	}

	/**
	 * Gets the dr cr.
	 *
	 * @return the dr cr
	 */
	public String getDrCr() {
		return drCr;
	}

	/**
	 * Sets the dr cr.
	 *
	 * @param drCr the new dr cr
	 */
	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	/**
	 * Gets the repayment amount.
	 *
	 * @return the repayment amount
	 */
	public double getRepaymentAmount() {
		return repaymentAmount;
	}

	/**
	 * Sets the repayment amount.
	 *
	 * @param repaymentAmount the new repayment amount
	 */
	public void setRepaymentAmount(double repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	/**
	 * Gets the repayment date.
	 *
	 * @return the repayment date
	 */
	public Date getRepaymentDate() {
		return repaymentDate;
	}

	/**
	 * Sets the repayment date.
	 *
	 * @param repaymentDate the new repayment date
	 */
	public void setRepaymentDate(Date repaymentDate) {
		this.repaymentDate = repaymentDate;
	}

	/**
	 * Gets the particulars.
	 *
	 * @return the particulars
	 */
	public String getParticulars() {
		return particulars;
	}

	/**
	 * Sets the particulars.
	 *
	 * @param particulars the new particulars
	 */
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}

	/**
	 * Gets the request status.
	 *
	 * @return the request status
	 */
	public int getRequestStatus() {
		return requestStatus;
	}

	/**
	 * Sets the request status.
	 *
	 * @param requestStatus the new request status
	 */
	public void setRequestStatus(int requestStatus) {
		this.requestStatus = requestStatus;
	}

	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the file name.
	 *
	 * @param fileName the new file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Gets the file sequence no.
	 *
	 * @return the file sequence no
	 */
	public int getFileSequenceNo() {
		return fileSequenceNo;
	}

	/**
	 * Sets the file sequence no.
	 *
	 * @param fileSequenceNo the new file sequence no
	 */
	public void setFileSequenceNo(int fileSequenceNo) {
		this.fileSequenceNo = fileSequenceNo;
	}

	/**
	 * Gets the created by.
	 *
	 * @return the created by
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the created by.
	 *
	 * @param createdBy the new created by
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * Gets the created date.
	 *
	 * @return the created date
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * Sets the created date.
	 *
	 * @param createdDate the new created date
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * Gets the updated date.
	 *
	 * @return the updated date
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * Sets the updated date.
	 *
	 * @param updatedDate the new updated date
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	/**
	 * Gets the updated by.
	 *
	 * @return the updated by
	 */
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * Sets the updated by.
	 *
	 * @param updatedBy the new updated by
	 */
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	
	
	
	/**
	 * Gets the penalty charged.
	 *
	 * @return the penalty charged
	 */
	public Double getPenaltyCharged() {
		return penaltyCharged;
	}

	/**
	 * Sets the penalty charged.
	 *
	 * @param penaltyCharged the new penalty charged
	 */
	public void setPenaltyCharged(Double penaltyCharged) {
		this.penaltyCharged = penaltyCharged;
	}

	/**
	 * Gets the penalty waved off.
	 *
	 * @return the penalty waved off
	 */
	public Double getPenaltyWavedOff() {
		return penaltyWavedOff;
	}

	/**
	 * Sets the penalty waved off.
	 *
	 * @param penaltyWavedOff the new penalty waved off
	 */
	public void setPenaltyWavedOff(Double penaltyWavedOff) {
		this.penaltyWavedOff = penaltyWavedOff;
	}

	

}
