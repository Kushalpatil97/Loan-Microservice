package com.loan.loanRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loan.entity.LoanEntity;

public interface LoanRepository  extends JpaRepository<LoanEntity,Long>{

	Optional<LoanEntity> FindByMobileNum(String MobileNum);
	Optional<LoanEntity> FindByLoanNum(String LoanNum);
	
	
	
}
