package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_FindMaxIntInArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String numbers = in.nextLine();

		String[] numerals = numbers.split(" ");

		int[] integers = new int[numerals.length];
		
		for (int i = 0; i < numerals.length; i++) {
			integers[i] = Integer.valueOf(numerals[i]);
		}
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(integers));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt(integers));
	}

	public static int maxInt(int[] intArray) {
		int max = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		return max;
	}
}