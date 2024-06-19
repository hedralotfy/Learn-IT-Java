package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Ex6_ExtendArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of an array: ");
		int arrayLength = in.nextInt();

		int[] Array = generateRandomArray(arrayLength);
		System.out.println(System.lineSeparator() + "****Initial Array****" + System.lineSeparator());
		System.out.println(Arrays.toString(Array));
		int[] extendedArray = extendArray(Array);
		System.out.println(System.lineSeparator() + "****Extended Array****" + System.lineSeparator());
		System.out.println(Arrays.toString(extendedArray));
	}

	public static int[] generateRandomArray(int arrayLength) {
		int[] randomArray = new int[arrayLength];
		Random r = new Random();
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = r.nextInt(100);
		}
		return randomArray;
	}

	public static int[] extendArray(int[] Array) {
		int[] extendedArray = new int[Array.length * 2];

		System.arraycopy(Array, 0, extendedArray, 0, Array.length);

		for (int i = 0, j = Array.length; j < extendedArray.length; i++, j++) {
			extendedArray[j] = Array[i] * 2;
		}

		return extendedArray;
	}

}
