package com.innovator.learnit.javacore.primitives.ControlStatements;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchStatementEx {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int i = 2;
		System.out.println(i);
		
		switch(i) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Number is not in 1-3 range.");
		}
		
		System.out.print("Enter a month here: ");
		int month = 4;
		System.out.println(month);
		String Season;
		
		switch(month) {
		case 11:
		case 12:
		case 1:
		case 2:
		case 3:
		case 4:
			Season = "Mild winter";
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			Season = "Hot summer";
			break;
		default:
			Season = "Hogus Bogus";
		}
		System.out.println("Month " + month + " is in " + Season + ".");
		
		String literalDig = "Two";
		
		switch(literalDig) {
		case "One":
			System.out.println("One");
			break;
		case "Two":
			System.out.println("Two");
			break;
		case "Three":
			System.out.println("Three");
			break;
		default:
			System.out.println("No match.");
		}
		
		int chapters = 2;
		int lessons = 2;
		
		switch (chapters) {
		case 1:
			System.out.println("We finished chapter 1 with all lessons");
		case 2:
			System.out.print("We finished chapter 2 till lesson index");
			switch (lessons) {
			case 1:
				System.out.println(".1");
			case 2:
				System.out.println(".2");
			}
		}

	}

}
