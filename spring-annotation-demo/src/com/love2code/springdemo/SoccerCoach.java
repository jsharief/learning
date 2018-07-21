package com.love2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SoccerCoach implements Coach {
	
	FortuneService fortuneService;
	
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	@Autowired  //Any method can be autowired..it is not only Getter 
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService pFortuneService) {
		this.fortuneService = pFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Hennur....";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return getFortuneService().getFortune();
	}

}
