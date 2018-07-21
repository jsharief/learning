package com.love2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FortuneFileReader {
	
	@PostConstruct
	public void doStart() {
		 
		System.out.println("Invoking the initialization....");
	}
	
	
	@PreDestroy
	public void doStop() {
		
		System.out.println("Invoking the destroy...");
	}
	
	
	public String[] getFortunes()throws IOException {
		
		FileReader fileReader = new FileReader(new File("/home/jsharief/etc/learning/spring-annotation-demo/src/Fortunes.txt"));
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = bufferedReader.readLine();
		String fortunes [] = new String[250];
		int linenumber = 0;
		while(line != null) {
			fortunes[linenumber] = line;
			line = bufferedReader.readLine();
			linenumber++;
		}
		
		return fortunes;
	}
	
	

}
