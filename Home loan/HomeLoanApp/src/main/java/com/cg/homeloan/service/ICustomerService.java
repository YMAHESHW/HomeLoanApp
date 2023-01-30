package com.cg.homeloan.service;

import java.time.LocalDate;

import java.util.List;

import com.cg.homeloan.entities.Customer;
import com.cg.homeloan.exception.CustomerNotFoundException;

public interface ICustomerService {

	public Customer addCustomer(Customer customer);

	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer deleteCustomer(int custid) throws CustomerNotFoundException;

	public Customer viewCustomer(int custid) throws CustomerNotFoundException;

	public List<Customer> viewAllCustomers();

	public List<Customer> viewCustomerList(LocalDate dateOfApplication);

}
