package com.cg.homeloan.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity(name = "loan_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	
	@NotEmpty(message = "Password can't be empty!")
	@Size(min = 8, max = 20, message = "Password has to be of minimum 8 chars!")
	private String password;

	@NotEmpty(message = "Role Type can't be empty!")
	@Size(min = 2, max = 14, message = "Invalid Role please enter a vaild Role!")
	@Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the role")
	private String role;

	public User(int userId) {
		super();
		this.userId = userId;
	}
	public User() {
		super();
	}
	public User(int userId,
			@NotEmpty(message = "Password can't be empty!") @Size(min = 8, max = 20, message = "Password has to be of minimum 8 chars!") String password,
			@NotEmpty(message = "Role Type can't be empty!") @Size(min = 2, max = 14, message = "Invalid Role please enter a vaild Role!") @Pattern(regexp = "^[a-zA-Z]*$", message = "Accepts only alphabets! re-enter the role") String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
	
	

}