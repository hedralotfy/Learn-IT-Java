package com.innovator.learnit.javacore.methods;

import java.util.Arrays;

public class ParameterPassingMechanism {

	public static void main(String[] args) {
		int i = 1;
		int[] array = {1,2,3};
		
		int[] backupArray = Arrays.copyOf(array, array.length);
		/*
		 * When this method is called, a copy of i is passed as a parameter.
		 */
		changeIntValue(i);
		System.out.println("i after changeIntValue():\t" + i); //10
		
		/*
		 * We assigned the variable i to the value returned
		 * from calling the changeInt(i) 
		 */
		i = changeInt(i);
		System.out.println("i after changeInt():\t" + i);
		
		System.out.println("value of array before changeArray(array) is\t" + Arrays.toString(array));
		
		changeArray(array);
		System.out.println("value of array after changeArray(array) is\t" + Arrays.toString(array));
		
		clearArray(array);
		System.out.println("value of array after clearArray(array) is\t" + Arrays.toString(array));
		
		System.out.println("Value of the original array is\t" + Arrays.toString(backupArray));
		
		int[] arr2 = array;
		System.out.println(Arrays.toString(arr2));
		
		char[] c = {'1', '2', '3','4','5'};
		int i2 = c.length;
		
		printCharArr(i2, c);
	}
	
	/**
	 * variable i with int data type will stay the same, as
	 * all primitive and reference data types are passed by value.
	 * A copy of variable i is created, when i was increased by
	 * 100 value.
	 * The result was assigned to the local i variable not the original one.
	 */
	
	/*
	 * Passing by value
	 */
	private static void changeIntValue(int i) {
		i += 100;
	}
	
	/*
	 * Passing by reference.
	 */
	private static int changeInt(int i) {
		return 0;
	}
	
	private static void changeArray(int[] array) {
		array[1] = 200;
	}
	
	private static void clearArray(int[] array) {
		array = null;
	}
	
	private static void printCharArr(int n, char[] c) {
		for(int i = 0; i<n; i++) {
			System.out.println(c[i]);
		}
		
	}

}
