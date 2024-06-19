package com.innovator.learnit.javacore.primitives.Strings.StringEXs;

import java.util.Formatter;

public class FormattingExercises {

	public static void main(String[] args) {
		Formatter formatter = new Formatter();
		String firstName = "Hero";
		int age = 20;
		String morning = "Morning";
		String Greeting = "Good %s, %s! \nGood I knew your age is %d";
		
		String Formatted = String.format(Greeting, morning, firstName, age);
		System.out.println(Formatted);
		System.out.print("Hedra");
		formatter.format("% d", 20);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%(d", -200);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%, d", 1000000);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%, .3f", 23425235235.2345);
		System.out.println(formatter);
		
		formatter = new Formatter();
		formatter.format("%, .2f", 1000000.125);
		System.out.println(formatter);
		
	}

}
