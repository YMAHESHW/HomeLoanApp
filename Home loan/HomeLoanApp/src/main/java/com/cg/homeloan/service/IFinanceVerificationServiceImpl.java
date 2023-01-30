package com.cg.homeloan.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Service
public class IFinanceVerificationServiceImpl implements IFinanceVerificationService {

	@Autowired
	ILoanApplicationRepository fApplicationRepository;

	public IFinanceVerificationServiceImpl(ILoanApplicationRepository applicationRepository) {
		super();
		this.fApplicationRepository = applicationRepository;
	}

	@Override
	@Transactional
	public LoanApplication updateStatus(LoanApplication loanApplication) throws InvalidLoanApplicationException {

		Optional<LoanApplication> optional = fApplicationRepository.findById(loanApplication.getApplicationId());
		if (optional.isPresent()) {
			fApplicationRepository.save(loanApplication);
			return loanApplication;
		} else {
			throw new InvalidLoanApplicationException("Loan application couldn't be Updated! ");

		}
	}

}