package com.luv2code.springdemmo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemmo")
public class SportsConfig {
	
	
	@Bean
	public FortuneService sadFortuneSrvice() {
		return new SadFortuneService();
		
	}
	
	@Bean
	public Coach swimCoach() {
		
		return new SwimCoach(sadFortuneSrvice());
	}
		 
	

}
