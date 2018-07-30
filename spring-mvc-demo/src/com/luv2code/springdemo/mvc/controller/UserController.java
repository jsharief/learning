package com.luv2code.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springdemo.mvc.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/showForm")
	public String showUserForm(Model pModel) {
		User user = new User();
		pModel.addAttribute("user",user);
		return "userForm";
	}
	
	@RequestMapping("/processRegistration")
	public String processRegistration(@ModelAttribute("user") User user) {
		
		System.out.println("User" +  user.getEmail());
		
		
		return "registrtionConfirm";
	}
	
}
