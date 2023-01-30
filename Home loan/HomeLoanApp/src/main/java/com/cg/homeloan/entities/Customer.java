package com.cg.homeloan.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Customer extends User {

	@NotEmpty(message = "Customer Name can't be empty!")
	@Size(min = 3, max = 25, message = "Invalid Customer Name please enter a vaild Customer Name!")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the name")
	private String customerName;

	@NotEmpty(message = "Phone Number can't be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number of minimum 10 digits")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only")
	private String mobileNumber;

	@NotEmpty(message = "Email ID can't be empty!")
	@Size(min = 2, max = 30, message = "Invalid Email ID please enter a vaild email ID")
	@Email(message = "Not the proper Email ID format! enter again")
	private String emailId;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;

	@NotEmpty(message = "Gender can't be empty!")
	@Size(min = 4, max = 6, message = "Please enter Male/Female/Others")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the gender")
	private String gender;

	@NotEmpty(message = "Nationality can't be empty!")
	@Size(min = 2, max = 15, message = "Please enter proper nationality")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the nationality")
	private String nationality;

	@NotEmpty(message = "Aadhar Card number can't be empty!")
	@Size(min = 12, max = 12, message = "Please enter 12 digit AADHAR!")
	private String aadharNumber;

	@NotEmpty(message = "PAN card number can't be empty!")
	@Size(min = 10, max = 10, message = "Please enter 10 digit PAN!")
	private String panNumber;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int userId,
			@NotEmpty(message = "Password can't be empty!") @Size(min = 8, max = 20, message = "Password has to be of minimum 8 chars!") String password,
			@NotEmpty(message = "Role Type can't be empty!") @Size(min = 2, max = 14, message = "Invalid Role please enter a vaild Role!") @Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the role") String role) {
		super(userId, password, role);
		
	}

	public Customer(int userId) {
		super(userId);
	}

	public Customer(int userId,
			@NotEmpty(message = "Customer Name can't be empty!") @Size(min = 3, max = 25, message = "Invalid Customer Name please enter a vaild Customer Name!") @Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the name") String customerName,
			@NotEmpty(message = "Phone Number can't be empty!") @Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number of minimum 10 digits") @Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only") String mobileNumber,
			@NotEmpty(message = "Email ID can't be empty!") @Size(min = 2, max = 30, message = "Invalid Email ID please enter a vaild email ID") @Email(message = "Not the proper Email ID format! enter again") String emailId,
			LocalDate dateOfBirth,
			@NotEmpty(message = "Gender can't be empty!") @Size(min = 4, max = 6, message = "Please enter Male/Female/Others") @Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the gender") String gender,
			@NotEmpty(message = "Nationality can't be empty!") @Size(min = 2, max = 15, message = "Please enter proper nationality") @Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the nationality") String nationality,
			@NotEmpty(message = "Aadhar Card number can't be empty!") @Size(min = 12, max = 12, message = "Please enter 12 digit AADHAR!") String aadharNumber,
			@NotEmpty(message = "PAN card number can't be empty!") @Size(min = 10, max = 10, message = "Please enter 10 digit PAN!") String panNumber) {
		super(userId);
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNumber = aadharNumber;
		this.panNumber = panNumber;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", nationality=" + nationality
				+ ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + "]";
	}
	
	
}