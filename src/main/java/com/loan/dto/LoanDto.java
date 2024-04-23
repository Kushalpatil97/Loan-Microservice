package com.loan.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoanDto {
	
	
	
	@NotEmpty(message = "Mobile Number cannot be empty")
	@Pattern(regexp = "(^$|[0-9]{10})", message="Mobile number must be 10 digits")
	private String MobileNumber;
	
	
	@NotEmpty(message = "Loan Number cannot be empty")
	@Pattern(regexp = "(^$|[0-9]{12})", message = "Loan Number should be 12 digits")
	private String LoanNumber;
	
	
	private String LoanType;
	
	@Positive(message = "Total amount should be greater than zero")
	private long LoanAmt;
	
	
	private long amountpaid;
	
	private long totalOutstanding;

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getLoanNumber() {
		return LoanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		LoanNumber = loanNumber;
	}

	public String getLoanType() {
		return LoanType;
	}

	public void setLoanType(String loanType) {
		LoanType = loanType;
	}

	public long getLoanAmt() {
		return LoanAmt;
	}

	public void setLoanAmt(long loanAmt) {
		LoanAmt = loanAmt;
	}

	public long getAmountpaid() {
		return amountpaid;
	}

	public void setAmountpaid(long amountpaid) {
		this.amountpaid = amountpaid;
	}

	public long getTotalOutstanding() {
		return totalOutstanding;
	}

	public void setTotalOutstanding(long totalOutstanding) {
		this.totalOutstanding = totalOutstanding;
	}
	
	
}

