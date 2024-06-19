package com.innovator.learnit.javacore.primitives.Array;

import java.util.Arrays;

public class Array {
	public static final String mina= "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	public static void main(String[] args) {

		int month_days[];
		month_days = new int[12];
		month_days[0]=30;
		month_days[1]=31;
		month_days[2]=30;
		month_days[3]=31;
		month_days[4]=30;
		month_days[5]=31;
		month_days[6]=30;
		month_days[7]=31;
		month_days[8]=30;
		month_days[9]=31;
		month_days[10]=30;
		month_days[11]=31;
		System.out.println("December has " + month_days[3] + " days.");
		
		int week_days[] = {1,2,3,4,5,6,7};
		System.out.println("We are in the day " + week_days[6]);
		
		double nums[] = {10.2, 10.1, 4.3, 23.5, 43.6};
		double sum = 0;
		int i;
		double Average;
		for(i=0 ; i<5 ; i++) {
			sum += nums[i];
		}
		Average = sum / i;
		System.out.println("Average of numbers is " + Average);
		
		String[] elements = mina.split("\\;+|\\n|([A-Z][a-z]{3}[a-z]*\\;[A-Z][a-z]{3}[a-z]*\\;[A-Z][a-z]{3}[a-z]*)");
		System.out.println(Arrays.toString(elements));
		System.out.println(elements.length);
		
	}
}