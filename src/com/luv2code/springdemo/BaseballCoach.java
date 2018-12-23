package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	//define a private field for the dependency so that it can be accepted by the constructor
	private FortuneService fortuneService;
	
	//define  a constructor for dependency injection 
	//by this step we are injecting dependency in form of constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	
 @Override
	public String getDailyWorkout() {
	return "spend 30 minutes on batting practice";
}

@Override
public String getDailyFortune() {
	return fortuneService.getFortune();

}
}
