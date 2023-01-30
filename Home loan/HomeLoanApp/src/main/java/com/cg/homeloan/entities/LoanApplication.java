package com.cg.homeloan.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.DecimalMin;
//import javax.validation.constraints.FutureOrPresent;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

@Entity
public class LoanApplication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationId;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate applicationDate;

	@OneToOne
	@JoinColumn(name = "user_Info", referencedColumnName = "userId")

	private Customer customer;

	@DecimalMin(value = "0", message = "Loan applied amount should not be less than thousand values")
	private double loanAppliedAmount;

	@DecimalMin(value = "0", message = "Loan approved amount should not be less than thousand values")
	private double loanApprovedAmount;

	private boolean landVerificationApproval;

	@Column
	@ApiModelProperty(name = "Finance verification approval status", value = "It holds the finance verification approval status", required = true)
	private boolean financeVerificationApproval;

	private boolean adminApproval;
	@Enumerated(EnumType.STRING)

	private Status status;

	public LoanApplication(long applicationId, Status status) {
		super();
		this.applicationId = applicationId;
		this.status = status;
	}

	public LoanApplication() {
		super();
	}

	public LoanApplication(long applicationId, LocalDate applicationDate, Customer customer,
			@DecimalMin(value = "0", message = "Loan applied amount should not be less than thousand values") double loanAppliedAmount,
			@DecimalMin(value = "0", message = "Loan approved amount should not be less than thousand values") double loanApprovedAmount,
			boolean landVerificationApproval, boolean financeVerificationApproval, boolean adminApproval,
			Status status) {
		super();
		this.applicationId = applicationId;
		this.applicationDate = applicationDate;
		this.customer = customer;
		this.loanAppliedAmount = loanAppliedAmount;
		this.loanApprovedAmount = loanApprovedAmount;
		this.landVerificationApproval = landVerificationApproval;
		this.financeVerificationApproval = financeVerificationApproval;
		this.adminApproval = adminApproval;
		this.status = status;
	}
	

	public long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}

	public LocalDate getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getLoanAppliedAmount() {
		return loanAppliedAmount;
	}

	public void setLoanAppliedAmount(double loanAppliedAmount) {
		this.loanAppliedAmount = loanAppliedAmount;
	}

	public double getLoanApprovedAmount() {
		return loanApprovedAmount;
	}

	public void setLoanApprovedAmount(double loanApprovedAmount) {
		this.loanApprovedAmount = loanApprovedAmount;
	}

	public boolean isLandVerificationApproval() {
		return landVerificationApproval;
	}

	public void setLandVerificationApproval(boolean landVerificationApproval) {
		this.landVerificationApproval = landVerificationApproval;
	}

	public boolean isFinanceVerificationApproval() {
		return financeVerificationApproval;
	}

	public void setFinanceVerificationApproval(boolean financeVerificationApproval) {
		this.financeVerificationApproval = financeVerificationApproval;
	}

	public boolean isAdminApproval() {
		return adminApproval;
	}

	public void setAdminApproval(boolean adminApproval) {
		this.adminApproval = adminApproval;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", applicationDate=" + applicationDate
				+ ", customer=" + customer + ", loanAppliedAmount=" + loanAppliedAmount + ", loanApprovedAmount="
				+ loanApprovedAmount + ", landVerificationApproval=" + landVerificationApproval
				+ ", financeVerificationApproval=" + financeVerificationApproval + ", adminApproval=" + adminApproval
				+ ", status=" + status + "]";
	}

	
	
	
}