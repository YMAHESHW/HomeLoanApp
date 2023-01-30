package com.cg.homeloan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entities.LandVerificationOfficer;
import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;
import com.cg.homeloan.service.ILandVerificationService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/landverify")
public class LandVerificationController {

	@Autowired
	private ILandVerificationService lservice;

	@ApiOperation(value = "PUT mapping for the Land Verification to update the status of application", response = LandVerificationOfficer.class)
	@PutMapping("/landstatus")
	public LoanApplication updateStatus(@RequestBody @Valid LoanApplication loanapplication)
			throws InvalidLoanApplicationException {
		return this.lservice.updateStatus(loanapplication);
	}

}