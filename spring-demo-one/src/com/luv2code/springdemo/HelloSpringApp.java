package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationConfiguration.xml");
		Coach theCoach = applicationContext.getBean("theCoach",Coach.class);
		//Property Injection
		CricketCoach crikcet = applicationContext.getBean("theCoach",CricketCoach.class);
		
		Coach baseCoach = applicationContext.getBean("baseCoach",Coach.class);
		
		BaseBallCoach baseballcoach = applicationContext.getBean("baseCoach",BaseBallCoach.class);
		
		//Constructor Injection
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		//Setter Injection
		System.out.println(baseCoach.getDailyFortune());
		System.out.println(baseCoach.getDailyWorkout());
		
		//Property Injection
		System.out.println(crikcet.getTeam());
		System.out.println(crikcet.getEmailAddress());
		
		//Property Injection from File
		System.out.println(baseballcoach.getTeam());
		System.out.println(baseballcoach.getEmail());
		
		//Random Fortune
		System.out.println(baseCoach.getRandomFortune());
		
		((ClassPathXmlApplicationContext)applicationContext).close();

	}

}
