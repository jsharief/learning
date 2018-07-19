package com.luv2code.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanscope-applicationConfiguration.xml");
		
		Coach coach = applicationContext.getBean("baseCoach",Coach.class);
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach);
	}

}
