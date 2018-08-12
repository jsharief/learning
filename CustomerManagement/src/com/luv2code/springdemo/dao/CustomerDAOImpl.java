package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;


@Repository
public class CustomerDAOImpl  implements CustomerDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;

	
	
	public CustomerDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public List<Customer> getCustomers() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> customerQuery = session.createQuery("from Customer order by lastName",Customer.class);
		
		List<Customer> customers = customerQuery.getResultList();
		// TODO Auto-generated method stub
		return customers;
	}

	@Override
	 
	public boolean addCustomer(Customer pCustomer) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(pCustomer);
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCustomer(Customer pCustomer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String customerId) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Customer getCustomerById(Integer pId) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, pId);
		return customer;
	}
	
	

}
