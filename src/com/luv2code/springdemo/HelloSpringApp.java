package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	    //load spring configration file
		//spring container class
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring cntainer 
		Coach theCoach = context.getBean("myCoach",Coach.class);		
		// call methods on thebeans
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
