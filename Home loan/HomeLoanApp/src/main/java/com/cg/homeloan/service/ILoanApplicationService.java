package com.cg.homeloan.service;

import java.util.List;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;

public interface ILoanApplicationService {

	public LoanApplication addLoanApplication(LoanApplication loanApplication);

	public LoanApplication updateLoanApplication(LoanApplication loanApplication)
			throws InvalidLoanApplicationException;

	public LoanApplication deleteLoanApplication(long loanApplicationId) throws InvalidLoanApplicationException;

	public List<LoanApplication> retrieveAllLoanApplication();

	public LoanApplication retrieveLoanApplicationById(long loanApplicationId) throws InvalidLoanApplicationException;

}
