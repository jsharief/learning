package com.luv2code.springdemmo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("theCoach")
@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("fileFortuneService")
	FortuneService fortuneService;
	
	@Value("${tennis.coachName}")
	String coachName;
	
	@Value("${tennis.teams}")
	String[] teams;
	
	
	@Value("${tennis.email}")
	String email;
		

	 

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String[] getTeams() {
		return teams;
	}

	public void setTeams(String[] teams) {
		this.teams = teams;
	}
	
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
