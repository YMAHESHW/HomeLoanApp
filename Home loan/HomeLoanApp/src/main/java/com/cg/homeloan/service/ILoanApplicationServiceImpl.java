package com.cg.homeloan.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;
import com.cg.homeloan.repository.ILoanApplicationRepository;

@Service
public class ILoanApplicationServiceImpl implements ILoanApplicationService {

	@Autowired
	ILoanApplicationRepository repository;

	public ILoanApplicationServiceImpl(ILoanApplicationRepository repository) {
		super();
		this.repository = repository;
	}

	@Transactional
	@Override
	public LoanApplication addLoanApplication(LoanApplication loanApplication) {

		try {
			repository.save(loanApplication);
		} catch (Exception e) {

		}
		return loanApplication;
	}

	@Transactional
	@Override
	public LoanApplication updateLoanApplication(LoanApplication loanApplication)
			throws InvalidLoanApplicationException {

		Optional<LoanApplication> optional = repository.findById(loanApplication.getApplicationId());
		if (optional.isPresent()) {
			repository.save(loanApplication);
			return optional.get();
		} else {

			throw new InvalidLoanApplicationException("Loan application couldn't be Updated! ");
		}

	}

	@Transactional
	@Override
	public LoanApplication deleteLoanApplication(long loanApplicationId) throws InvalidLoanApplicationException {

		Optional<LoanApplication> optional = repository.findById(loanApplicationId);
		if (optional.isPresent()) {
			repository.deleteById(loanApplicationId);
			return optional.get();
		} else {
			throw new InvalidLoanApplicationException("Loan application ID not found for delete operation!");
		}

	}

	@Override
	public List<LoanApplication> retrieveAllLoanApplication() {

		List<LoanApplication> list = null;
		try {
			list = repository.findAll();
		} catch (Exception e) {

		}
		return list;
	}

	@Override
	public LoanApplication retrieveLoanApplicationById(long loanApplicationId) throws InvalidLoanApplicationException {

		Optional<LoanApplication> optional = repository.findById(loanApplicationId);
		if (optional.isPresent()) {
			repository.findById(loanApplicationId);
			return optional.get();
		} else {
			throw new InvalidLoanApplicationException("Loan application ID not found in records!");
		}

	}

}