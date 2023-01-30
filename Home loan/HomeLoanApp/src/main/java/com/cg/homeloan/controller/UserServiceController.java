package com.cg.homeloan.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.homeloan.entities.Admin;
import com.cg.homeloan.entities.FinanceVerificationOfficer;
import com.cg.homeloan.entities.LandVerificationOfficer;
import com.cg.homeloan.entities.User;
import com.cg.homeloan.service.IUserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	

	@Autowired
	IUserService userService;

	@ApiOperation(value = "POST mapping to add new user as admin to the LOAN_USER table in the Database", response = User.class)
	@PostMapping("/adduserasadmin")
	public Admin addNewUser(@RequestBody @Valid Admin admin) {
		this.userService.addNewUser(admin);
		return admin;

	}

	@ApiOperation(value = "POST mapping to add new user as landofficer to the LOAN_USER table in the Database", response = User.class)
	@PostMapping("/adduseraslandofficer")
	public LandVerificationOfficer addNewUser(
			@RequestBody @Valid LandVerificationOfficer landOfficerVerificationOfficer) {
		this.userService.addNewUser(landOfficerVerificationOfficer);
		return landOfficerVerificationOfficer;

	}

	@ApiOperation(value = "POST mapping to add new user as financeofficer to the LOAN_USER table in the Database", response = User.class)
	@PostMapping("/adduserasfinanceofficer")
	public FinanceVerificationOfficer addNewUser(
			@RequestBody @Valid FinanceVerificationOfficer financeVerificationOfficer) {
		this.userService.addNewUser(financeVerificationOfficer);
		return financeVerificationOfficer;

	}

	@ApiOperation(value = "POST mapping to add new user to the LOAN_USER table in the Database", response = User.class)
	@PostMapping("/signin")
	public String signIn(@RequestBody @Valid User user) throws Exception {

		return this.userService.signIn(user);
	}

	@ApiOperation(value = "POST mapping to logout from the LOAN_USER table in the Database", response = User.class)
	@PostMapping("/signout")
	public String signOut(@RequestBody @Valid User user) throws Exception {

		return this.userService.signOut(user);

	}
}
