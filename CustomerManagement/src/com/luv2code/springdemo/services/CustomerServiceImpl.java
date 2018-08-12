package com.luv2code.springdemo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO customerDAO;
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers();
	}
	@Transactional
	@Override
	public boolean addCustomer(Customer pCustomer) {
		// TODO Auto-generated method stub
		customerDAO.addCustomer(pCustomer);
		return false;
	}

	@Override
	public boolean updateCustomer(Customer pCustomer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Integer customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public Customer getCustomerById(Integer pId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomerById(pId);
	}
	
	
	

}
