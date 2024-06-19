package com.innovator.learnit.javacore.primitives.ControlStatements;

public class SwitchStatement {

	public static void main(String[] args) {
		//expression types available: byte, short, int, long, char, Enum, string.
		String userStatus = "Premium-Customer";
		
		switch(userStatus) {
		case "Guest":
			System.out.println("You've got 10% discount.");
			break;
		case "Special":
			System.out.println("You've got 40% discount.");
			break;
		case "Premium-Customer":
			System.out.println("You've got 99% discount.");
			break;
		default:
			System.out.println("Thanks for ordering.");
		}
		
		System.out.println();
		System.out.println("===== No break case 1 =====");
		System.out.println();
		
		int i = 1;
		switch(i) {
		case 1:
			System.out.println("One");
		case 2:
			System.out.println("Two");
		default:
			System.out.println("This is default block");
		}
		
		System.out.println();
		System.out.println("===== No break case 2 =====");
		System.out.println();
		
		int i2 = 2%2;
		switch(i2) {
		case 0:
			System.out.println("Even");
		default:
			System.out.println("Odd");
		}
		
		System.out.println();
		System.out.println("===== Default block demo =====");
		System.out.println();
		
		i = 10;
		
		switch(i) {
		case 1:
			System.out.println("One");
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("This is default block");
		}
	}

}
