package com.loan.service.impl;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.loan.dto.LoanDto;
import com.loan.entity.LoanEntity;
import com.loan.exception.LoanAlreadyExists;
import com.loan.exception.ResourceNotFoundException;
import com.loan.loanRepository.LoanRepository;
import com.loan.mapper.Loansmapper;
import com.loan.service.LoanService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoanServiceImpl implements LoanService {

	private LoanRepository loansRepository;
	@Override
	public void createLoan(String mobileNumber) {
		// TODO Auto-generated method stub
		Optional<LoanEntity> optionalLoans = loansRepository.FindByMobileNum(mobileNumber);
		if(optionalLoans.isPresent())
		{
			throw new LoanAlreadyExists("Loan already registered with given Mobilenumber");
			
		}
		loansRepository.save(CreateNewLoan(mobileNumber));
		
		
	}
	
	public LoanEntity CreateNewLoan(String mobileNumber)
	{
		
		LoanEntity loan = new LoanEntity();
		long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
		
		loan.setCustomerName("demo");
		loan.setLoanNum(randomLoanNumber);
		loan.setMobileNum(mobileNumber);
		
		//add remaining data
		
		return loan;
		
	}

	@Override
	public LoanDto fetchLoan(String mobileNumber) {
		// TODO Auto-generated method stub
		
		LoanEntity loan = loansRepository.FindByMobileNum(mobileNumber).orElseThrow(
			() -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber)	
				);
		
				
				
		return Loansmapper.MapToLoandto(loan, new LoanDto());
	}

	@Override
	public boolean updateLoan(LoanDto loansDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteLoan(String mobileNumber) {
		// TODO Auto-generated method stub
		return false;
	}

}
