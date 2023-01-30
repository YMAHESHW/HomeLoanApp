package com.cg.homeloan.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Admin extends User {

	@NotEmpty(message = "Admin Name can't be empty!")
	@Size(min = 3, max = 25, message = "Invalid Admin Name please enter a vaild Admin Name!")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the admin name")
	private String adminName;

	@NotEmpty(message = "Phone Number can't be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number minimum of 10 digits")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only")
	private String adminContact;

	public Admin() {
		super();
	}
	public Admin(int userId, String password, String role) {
		super(userId, password, role);
	}
	public Admin(int userId) {
		super(userId);
	}
	
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", adminContact=" + adminContact + "]";
	}
	
	
	
	
}
