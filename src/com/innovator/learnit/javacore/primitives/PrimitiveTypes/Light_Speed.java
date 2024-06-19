package com.innovator.learnit.javacore.primitives.PrimitiveTypes;

//Compute distance light travels using long variables.

public class Light_Speed {

	public static void main(String[] args) {
		int lightspeed;
		long day;
		long distance;
		long seconds;
		
		// approximate speed of light in miles per second
		lightspeed = 186000;
		
		day = 1000; // specify number of days here
		
		seconds = day * 24 * 60 * 60; // convert to seconds
		
		distance = lightspeed * seconds; // compute distance
		
		System.out.print("In " + day + " days, ");
		System.out.print("light will travel about " + distance);
		System.out.println(" miles.");

	}
}
