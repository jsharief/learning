package com.luv2code.springdemmo;

public class SwimCoach implements Coach {
	
	FortuneService fortuneService;
	

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

}
