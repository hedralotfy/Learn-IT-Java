package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;
import java.lang.Math;

public class Ex7_GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 numbers ");
		int firstNumber = in.nextInt();
		int secondNumber = in.nextInt();

		System.out.println("The GCD number is " + gcdNumber(firstNumber, secondNumber));
		System.out.println("The GCD gotten by division is " + gcdDivision(firstNumber, secondNumber));
		System.out.println("The GCD gotten by subtration is " + gcdSubtraction(firstNumber, secondNumber));

	}

	public static int gcdNumber(int firstNumber, int secondNumber) {
		int GCD = 1;
		int greater;
		int smaller;
		if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
			greater = Math.abs(firstNumber);
			smaller = Math.abs(secondNumber);
		} else {
			greater = Math.abs(secondNumber);
			smaller = Math.abs(firstNumber);
		}
		for (int i = 2; i <= smaller; i++) {

			if (greater % i == 0 && smaller % i == 0) {
				GCD = i;
			}
		}
		return GCD;
	}

	public static int gcdDivision(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return Math.abs(firstNumber);
		} else {
			return gcdDivision(secondNumber, firstNumber % secondNumber);
		}
	}

	public static int gcdSubtraction(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			return Math.abs(firstNumber);
		} else {
			return gcdSubtraction(secondNumber, Math.abs(secondNumber-firstNumber));
		}
	}

}
