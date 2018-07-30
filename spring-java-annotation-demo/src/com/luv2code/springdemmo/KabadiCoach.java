package com.luv2code.springdemmo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("theCoach")
@Component
public class KabadiCoach implements Coach{
	
	FortuneService fortuneService;
	
	//@Autowired  Constructor injectiion is taken care by Spring if there is one
	// when multiple beans qualified shoould be specifed like this for constructor
	public KabadiCoach(@Qualifier("happyFortuneService")FortuneService pFortuneService ) {
		// TODO Auto-generated constructor stub
		fortuneService  = pFortuneService;
	
	}
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Run run ago so that you will win!!";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
