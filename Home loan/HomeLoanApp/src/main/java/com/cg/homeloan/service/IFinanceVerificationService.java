package com.cg.homeloan.service;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;

public interface IFinanceVerificationService {

	public LoanApplication updateStatus(LoanApplication loanApplication) throws InvalidLoanApplicationException;

}
