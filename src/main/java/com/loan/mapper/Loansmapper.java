package com.loan.mapper;

import com.loan.dto.LoanDto;
import com.loan.entity.LoanEntity;

public class Loansmapper {
	
	public static LoanDto MapToLoandto(LoanEntity loan, LoanDto loandto)
	{
		
		loandto.setMobileNumber(loan.getMobileNum());
		loandto.setLoanType(loan.getLoanType());
		return loandto;
		
	}

}
