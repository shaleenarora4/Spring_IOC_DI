package com.luv2code.springdemo;

//fortune is dependent on coach

// class implementing FortuneService Interface 
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
