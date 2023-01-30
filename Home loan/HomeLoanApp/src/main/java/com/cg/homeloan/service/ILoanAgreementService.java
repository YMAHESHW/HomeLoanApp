package com.cg.homeloan.service;

import java.util.List;

import com.cg.homeloan.entities.LoanAgreement;
import com.cg.homeloan.exception.InvalidLoanAgreementException;

public interface ILoanAgreementService {

	public LoanAgreement addLoanAgreement(LoanAgreement loanAgreement) throws Exception;

	public LoanAgreement updateLoanAgreement(LoanAgreement loanAgreement) throws InvalidLoanAgreementException;

	public LoanAgreement deleteLoanAgreement(long loanAgreementId) throws InvalidLoanAgreementException;

	public List<LoanAgreement> retrieveAllLoanAgreement();

	public LoanAgreement retrieveLoanAgreementById(long loanAgreementId) throws InvalidLoanAgreementException;

}
