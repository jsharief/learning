package com.springdemo.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CustomerController {
	
	
	public CustomerController() {
		
		System.out.println("hellooooo loadded....ß");
		// TODO Auto-generated constructor stub
	}
	
	
	
	@RequestMapping("/customers/list")
	public String listCustomers(Model pModel) {
		
		return "list-customers";
	}

}
