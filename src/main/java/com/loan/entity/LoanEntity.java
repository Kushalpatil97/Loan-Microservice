package com.loan.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LoanEntity extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long LoanId;
	
	private String MobileNum;
	
	private String CustomerName;
	
	private String LoanType;
	
	private int totalamount;

	private long LoanNum;

	public long getLoanId() {
		return LoanId;
	}

	public void setLoanId(long loanId) {
		LoanId = loanId;
	}

	public String getMobileNum() {
		return MobileNum;
	}

	public void setMobileNum(String mobileNum) {
		MobileNum = mobileNum;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getLoanType() {
		return LoanType;
	}

	public void setLoanType(String loanType) {
		LoanType = loanType;
	}

	public int getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}

	public long getLoanNum() {
		return LoanNum;
	}

	public void setLoanNum(long randomLoanNumber) {
		LoanNum = randomLoanNumber;
	}
	
	
}
