package com.luv2code.springdemmo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {

//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation-applicationConfiguration.xml");
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach coach = applicationContext.getBean("kabadiCoach",Coach.class);
		Coach coach1 = applicationContext.getBean("soccerCoach",Coach.class);
		TennisCoach coach3 = applicationContext.getBean("tennisCoach",TennisCoach.class);
		
		Coach swimCoach = applicationContext.getBean("swimCoach",Coach.class);
		
		
		
		System.out.println(coach1.getDailyWorkOut());
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getFortune());
		System.out.println(coach1.getFortune());
		System.out.println(coach3.getDailyWorkOut());
		System.out.println(coach3.getFortune());
		System.out.println(coach3.getCoachName());
		System.out.println(coach3.getTeams()[0]);
		System.out.println(coach3.getEmail());
		System.out.println(swimCoach.getDailyWorkOut());
		System.out.println(swimCoach.getFortune());
		
	
	}
}
