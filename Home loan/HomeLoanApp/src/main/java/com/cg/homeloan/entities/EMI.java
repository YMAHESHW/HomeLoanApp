package com.cg.homeloan.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity

public class EMI {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long emiId;

	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dueDate;

	@DecimalMin(value = "0", message = "Emi should not be zero")
	private double emiAmount;

	@DecimalMin(value = "0", message = "Loan should not be zero")
	private double loanAmount;

	@DecimalMin(value = "0", message = "Interest should not be zero")
	private double interestAmount;

	public EMI() {
		super();
	}

	public EMI(Long emiId, LocalDate dueDate,
			@DecimalMin(value = "0", message = "Emi should not be zero") double emiAmount,
			@DecimalMin(value = "0", message = "Loan should not be zero") double loanAmount,
			@DecimalMin(value = "0", message = "Interest should not be zero") double interestAmount) {
		super();
		this.emiId = emiId;
		this.dueDate = dueDate;
		this.emiAmount = emiAmount;
		this.loanAmount = loanAmount;
		this.interestAmount = interestAmount;
	}

	public Long getEmiId() {
		return emiId;
	}

	public void setEmiId(Long emiId) {
		this.emiId = emiId;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(double interestAmount) {
		this.interestAmount = interestAmount;
	}

	@Override
	public String toString() {
		return "EMI [emiId=" + emiId + ", dueDate=" + dueDate + ", emiAmount=" + emiAmount + ", loanAmount="
				+ loanAmount + ", interestAmount=" + interestAmount + "]";
	}
	
	
	
}