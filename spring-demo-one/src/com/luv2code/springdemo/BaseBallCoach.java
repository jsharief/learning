package com.luv2code.springdemo;

/**
 * @author jsharief
 *
 */
public class BaseBallCoach implements Coach {
	
	FortuneService fortuneService;
	
	String email;
	
	String team;
	
	
	public BaseBallCoach() {
		// TODO Auto-generated constructor stub
		System.out.println("Insider::BaseBallCoacher Iniitiazlise");
		
	}
	
	
	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/**
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		
		return "Walk 30 minutes every day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}


	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}


	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getRandomFortune();
	}
	
	
	
}
