package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		//create object
		Coach newCoach = new TrackCoach();
		//use object
		System.out.println(newCoach.getDailyWorkout());
	}

}
