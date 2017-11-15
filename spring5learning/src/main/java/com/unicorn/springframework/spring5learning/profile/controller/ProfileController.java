package com.unicorn.springframework.spring5learning.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unicorn.springframework.spring5learning.profile.repositories.ProfileRepository;

@Controller
public class ProfileController {
	
	
		ProfileRepository profileRepository;
		 public ProfileController(ProfileRepository pProfileRepository) {
			// TODO Auto-generated constructor stub
			profileRepository = pProfileRepository;
			
		}

	    @RequestMapping("/customers")
		public String getCustomers(Model pModel) {
			// TODO Auto-generated method stub
	    	 pModel.addAttribute("customers", profileRepository.findAll());
	    	 System.out.println("profileRepository.findAll())" + profileRepository.findAll());
	    	 return "customers";

		}
	
}
