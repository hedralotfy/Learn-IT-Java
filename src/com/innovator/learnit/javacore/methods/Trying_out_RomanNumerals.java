package com.innovator.learnit.javacore.methods;

import java.util.Scanner;

public class Trying_out_RomanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a roman number: ");
		String romanNumber = in.next();
		String[] romanNumberArr = romanNumber.split("");
		int decimalNumber = 0;
		int numberLength = romanNumberArr.length;

		int j = numberLength - 1;
		firstloop: for (int i = numberLength - 1; i >= 0; i--) {
			for (; j >= 0; j--) {
				if (romanNumberArr[i].equalsIgnoreCase("X")) {
					if (i == j) {
						decimalNumber = 10;
						continue;
					}
					if (romanNumberArr[i].equals(romanNumberArr[j])) {
						decimalNumber += 10;
					} else if (romanNumberArr[j].equalsIgnoreCase("L")) {
						decimalNumber += 50;
						continue;
					} else {
						decimalNumber -= 1;
					}
					j--;
					continue firstloop;
				}
			}
		}
		System.out.println(decimalNumber);
	}
}
