package com.cg.homeloan.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Service
public class ILandVerificationServiceImpl implements ILandVerificationService {

	@Autowired
	ILoanApplicationRepository applicationRepository;

	public ILandVerificationServiceImpl(ILoanApplicationRepository applicationRepository) {
		super();
		this.applicationRepository = applicationRepository;
	}

	@Override
	@Transactional
	public LoanApplication updateStatus(LoanApplication loanApplication) throws InvalidLoanApplicationException {
		Optional<LoanApplication> optional = applicationRepository.findById(loanApplication.getApplicationId());

		if (optional.isPresent()) {
			applicationRepository.save(loanApplication);

			return loanApplication; // returns updated loan application
		} else {
			throw new InvalidLoanApplicationException("Loan application couldn't be Updated! "); // returns the stated
																									// exception message
		}

	}
}
