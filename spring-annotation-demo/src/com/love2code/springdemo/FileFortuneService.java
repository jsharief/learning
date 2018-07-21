 package com.love2code.springdemo;

import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	
	@Autowired
	FortuneFileReader fileFortuneReader;
	
	

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int number = 0;
		String fortune = null;
		try {
			number = random.nextInt(fileFortuneReader.getFortunes().length);
			 fortune = fileFortuneReader.getFortunes()[number];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fortune = "default catch fortune...";
			e.printStackTrace();
		}
		
		return fortune;
	}
	

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
