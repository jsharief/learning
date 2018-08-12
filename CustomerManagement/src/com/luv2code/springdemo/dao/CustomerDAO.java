package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public boolean addCustomer(Customer pCustomer);
	
	public boolean updateCustomer(Customer pCustomer);
	
	public boolean delete(String customerId);
	
	public Customer getCustomerById(Integer pId);
	

}
