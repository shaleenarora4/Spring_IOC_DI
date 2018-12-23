package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
	
		//code to an interface which can be supported by all coaches
		//create obj	
		Coach theCoach=new TrackCoach();
		// we are coding to an interface therefore we can handle any coach
		System.out.println(theCoach.getDailyWorkout());
	

}
}
