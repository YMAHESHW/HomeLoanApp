package com.cg.homeloan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entities.LoanAgreement;
import com.cg.homeloan.exception.InvalidLoanAgreementException;
import com.cg.homeloan.service.ILoanAgreementService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/loanagreement")
public class LoanAgreementController {

	@Autowired
	ILoanAgreementService loanAgreementService;

	@ApiOperation(value = "POST mapping to add new loan agreements to the LOAN_AGREEMENT table in the Database", response = LoanAgreement.class)
	@PostMapping("/add")
	public LoanAgreement addLoanAgreement(@RequestBody @Valid LoanAgreement loanAgreement) throws Exception {
		this.loanAgreementService.addLoanAgreement(loanAgreement);
		return loanAgreement;
	}

	@ApiOperation(value = "PUT mapping to update the loan agreements in the LOAN_AGREEMENT table in the Database", response = LoanAgreement.class)
	@PutMapping("/update")
	public LoanAgreement updateLoanAgreement(@RequestBody @Valid LoanAgreement loanAgreement)
			throws InvalidLoanAgreementException {
		this.loanAgreementService.updateLoanAgreement(loanAgreement);
		return loanAgreement;
	}

	@ApiOperation(value = "DELETE mapping to delete the agreements from LOAN_AGREEMENT table by agreement ID in the Database", response = LoanAgreement.class)
	@DeleteMapping("/delete/{loanid}")
	public LoanAgreement deleteLoanAgreement(@PathVariable("loanid") long loanAgreementId)
			throws InvalidLoanAgreementException {
		return this.loanAgreementService.deleteLoanAgreement(loanAgreementId);

	}

	@ApiOperation(value = "GET mapping to view all the loan agreements in the database ", response = List.class)
	@GetMapping("/viewallloan")
	public List<LoanAgreement> retrieveAllLoanAgreement() {
		return this.loanAgreementService.retrieveAllLoanAgreement();

	}

	@ApiOperation(value = "GET mapping to view all the loan agreements by loan ID", response = LoanAgreement.class)
	@GetMapping("/viewbyid/{loanid}")
	public LoanAgreement retrieveLoanAgreementById(@PathVariable("loanid") long loanAgreementId)
			throws InvalidLoanAgreementException {
		return this.loanAgreementService.retrieveLoanAgreementById(loanAgreementId);

	}

}
