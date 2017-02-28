package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 Minutes on Batting Practice";

	}

	@Override
	public String getDailyFortune() {
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}
}
