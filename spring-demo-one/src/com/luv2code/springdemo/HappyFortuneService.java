package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You will have good day today !!!";
	}
	
	
	String fortuneArray [] = {"Hello You are doing Great","Are you ready today ?" , "Here is the national Pen"};
	
	
	public String getRandomFortune() {
		
		Random random = new Random();
				
		int number = random.nextInt(fortuneArray.length);
		
		return fortuneArray[number];
		
		
	}
	
	

}
