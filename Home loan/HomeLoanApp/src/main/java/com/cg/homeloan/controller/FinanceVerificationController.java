package com.cg.homeloan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;
import com.cg.homeloan.service.IFinanceVerificationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/financeverify")
public class FinanceVerificationController {
	
	@Autowired
	private IFinanceVerificationService service;

	@ApiOperation(value = "PUT mapping for the Finance Verification to update the status of application", response = FinanceVerificationController.class)
	@PutMapping("/financestatus")
	public LoanApplication updateStatus(@RequestBody @Valid LoanApplication loanapplication)
			throws InvalidLoanApplicationException {

		return this.service.updateStatus(loanapplication); // returns the updated loan application
	}

}