package com.luv2code.springdemmo;

import java.util.Random;

import org.springframework.stereotype.Component;

 @Component

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int number = random.nextInt(fortuneArray.length);
		
		return fortuneArray[number];
	}
	
	

	String fortuneArray [] = {"Hello You are doing Great","Are you ready today ?" , "Here is the national Pen"};
	
 
	
	

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		
		return null;
		
	 
	}

}
