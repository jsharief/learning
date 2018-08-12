package com.luv2code.springdemo.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	private CustomerService customerService; 
	
	@GetMapping("/list")
	public String listCustomers(Model pModel) {
		
		List< Customer> customers =   customerService.getCustomers();
		pModel.addAttribute("customers", customers);
		return "list-customers";
	}
	
	@GetMapping("/addCustomerForm")
	public String addCustomerForm(Model pModel) {
		
		Customer customer = new Customer();
		
		pModel.addAttribute("customer",customer);
		
		return "customer-form";
	}
 
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer pCustomer) {
		
		customerService.addCustomer(pCustomer);
		return "redirect:/customer/list";
		
	}
	
	
	@GetMapping("/updateCustomer")
	public String updateCustomerForm(Model pModel,@RequestParam ("customerId") Integer customerId ) {
		
		System.out.println(customerId);
		
		Customer customer = customerService.getCustomerById(customerId);
		
		pModel.addAttribute("customer",customer);
		
		return "customer-form";
	}
}
