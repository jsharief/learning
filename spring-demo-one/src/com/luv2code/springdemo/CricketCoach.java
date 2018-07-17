package com.luv2code.springdemo;

/**
 * @author jsharief
 *
 */
public class CricketCoach implements Coach {

	FortuneService fortuneService;
	
	String emailAddress;
	
	String team;
	
	
	
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}



	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hey Daily Cricket Coach";
	}
	
	
	
	public CricketCoach(FortuneService pFortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = pFortuneService;
		
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}



	/**
	 * @return the team
	 */
	public String getTeam() {
		System.out.println("Invoking Getter by Spring");
		return team;
	}



	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		System.out.println("Invoking Setter by Spring");
		this.team = team;
	}



	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
