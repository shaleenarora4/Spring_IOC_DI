
package com.luv2code.springdemo;

public class CricketCoach implements Coach {
   
	private FortuneService fortuneService;
	private String emailAddress;
	private String Team;
	// create no arg constructor as spring will call this constructor when they make reference to our bean
	public CricketCoach()
	{
		System.out.println("CricketCoach : inside no arg Constructor");
	}
	
	//this setter method is called when we inject the dependency
	

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method-setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method-setTeam");
		Team = team;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return Team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method-setFortuneService");
		this.fortuneService = fortuneService;
	}
     

	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
