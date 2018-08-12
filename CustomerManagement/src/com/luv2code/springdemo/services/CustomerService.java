package com.luv2code.springdemo.services;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {

	
	public List<Customer> getCustomers();
	
	public boolean addCustomer(Customer pCustomer);
	
	public boolean updateCustomer(Customer pCustomer);
	
	public boolean delete(Integer customerId);
	
	public Customer getCustomerById(Integer pId);
	
	
}
