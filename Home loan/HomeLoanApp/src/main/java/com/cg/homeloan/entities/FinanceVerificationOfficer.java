package com.cg.homeloan.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity

public class FinanceVerificationOfficer extends User {

	@NotEmpty(message = "Finance Verification Officer Name can't be empty!")
	@Size(min = 3, max = 25, message = "Invalid Finance Verification Officer Name please enter a vaild Name!")
	@Pattern(regexp = "^[A-Za-z]+", message = "INVALID PLEASE ENTER AGAIN")
	private String finOfficerName;

	@NotEmpty(message = "Phone Number can't be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number of minimum 10 digits")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only")
	private String finOfficerContact;

	public FinanceVerificationOfficer() {
		super();
		
	}

	public FinanceVerificationOfficer(int userId,
			@NotEmpty(message = "Password can't be empty!") @Size(min = 8, max = 20, message = "Password has to be of minimum 8 chars!") String password,
			@NotEmpty(message = "Role Type can't be empty!") @Size(min = 2, max = 14, message = "Invalid Role please enter a vaild Role!") @Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the role") String role) {
		super(userId, password, role);
		
	}

	public FinanceVerificationOfficer(int userId) {
		super(userId);
		
	}

	public String getFinOfficerName() {
		return finOfficerName;
	}

	public void setFinOfficerName(String finOfficerName) {
		this.finOfficerName = finOfficerName;
	}

	public String getFinOfficerContact() {
		return finOfficerContact;
	}

	public void setFinOfficerContact(String finOfficerContact) {
		this.finOfficerContact = finOfficerContact;
	}

	@Override
	public String toString() {
		return "FinanceVerificationOfficer [finOfficerName=" + finOfficerName + ", finOfficerContact="
				+ finOfficerContact + "]";
	}
	
	

}