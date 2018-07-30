package com.luv2code.springdemmo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	FortuneService fortuneService;
	
	@Value("${swim.email}")
	private String email;
	

	public SwimCoach(FortuneService pFortuneService) {
		// TODO Auto-generated constructor stub
		
		fortuneService = pFortuneService;
	}
	
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Warm up swinnng !!!!";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
 
}
