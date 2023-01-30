package com.cg.homeloan.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entities.LoanApplication;
import com.cg.homeloan.exception.InvalidLoanApplicationException;
import com.cg.homeloan.service.ILoanApplicationService;

//import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/loanapplication")
public class LoanApplicationController {

	
	@Autowired
	ILoanApplicationService loanApplicationService;

	@ApiOperation(value = "POST mapping to add new loan applications to the LOAN_APPLICATION table in the Database", response = LoanApplication.class)
	@PostMapping("/add")
	public LoanApplication addLoanApplication(@RequestBody @Valid LoanApplication loanApplication) {
		this.loanApplicationService.addLoanApplication(loanApplication);
		return loanApplication;
	}

	@ApiOperation(value = "PUT mapping to update the loan application in the LOAN_APPLICATION table in the Database", response = LoanApplication.class)
	@PutMapping("/update")
	public LoanApplication updateLoanApplication(@RequestBody @Valid LoanApplication loanApplication)
			throws InvalidLoanApplicationException {
		this.loanApplicationService.updateLoanApplication(loanApplication);
		return loanApplication;
	}

	@ApiOperation(value = "DELETE mapping to delete the application from LOAN_APPLICATION table by application ID in the Database", response = LoanApplication.class)
	@DeleteMapping("/delete/{applicationid}")
	public LoanApplication deleteLoanApplication(@PathVariable("applicationid") long loanApplicationId)
			throws InvalidLoanApplicationException {
		return this.loanApplicationService.deleteLoanApplication(loanApplicationId);

	}

	@ApiOperation(value = "GET mapping to view all the loan applications in the database ", response = List.class)
	@GetMapping("/viewallloan")
	public List<LoanApplication> retrieveAllLoanApplication() {
		return this.loanApplicationService.retrieveAllLoanApplication();

	}

	@ApiOperation(value = "GET mapping to view all the loan applications by loan ID", response = LoanApplication.class)
	@GetMapping("/viewbyid/{loanid}")
	public LoanApplication retrieveLoanApplicationById(@PathVariable("loanid") long loanApplicationId)
			throws InvalidLoanApplicationException {
		return this.loanApplicationService.retrieveLoanApplicationById(loanApplicationId);

	}

}
