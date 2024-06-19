package com.innovator.learnit.javacore.primitives.Array;

import java.util.Arrays;

public class Single_Arrays {

	public static void main(String[] args) {
//		int month_days[]=new int[12];
//		month_days[0]=31;
//		month_days[1]=28;
//		month_days[2]=31;
//		month_days[3]=30;
//		month_days[4]=31;
//		month_days[5]=30;
//		month_days[6]=31;
//		month_days[7]=31;
//		month_days[8]=30;
//		month_days[9]=31;
//		month_days[10]=30;
//		month_days[11]=31;
		
		int month_days[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		String months[] = {"Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
		
		System.out.println("April has " + month_days[3] + " days.");
		System.out.println(Arrays.toString(month_days));
		double sum = 0;
		
		for(int i = 0; i < 12; i++) {
				System.out.println(months[i] + " has " + month_days[i] + " days.");
				sum += month_days[i];
		}
		System.out.println("The year has sum of " + sum + " days.");
		
		double values[]= {1.0, 32.4, 12.1, 5.34, 11.5};
		sum = 0;
		int i;
		for(i=0; i<values.length; i++){
			sum = sum + values[i];
		}
		double average = sum / i;
		System.out.println("Average of value is " + average);
	}
}
