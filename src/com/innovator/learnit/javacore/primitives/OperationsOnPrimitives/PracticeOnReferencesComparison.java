package com.innovator.learnit.javacore.primitives.OperationsOnPrimitives;

import java.util.Arrays;

public class PracticeOnReferencesComparison {
	public static void main(String[] args) {
		Integer i1 = 12;
		Integer i2 = 12;
		System.out.println("i1 == i2 is " + (i1 == i2));
		System.out.println();
		
		Integer op1 = Integer.valueOf(1);
		Integer op2 = Integer.valueOf(3);
		Integer sum = Integer.valueOf(op1 + op2);
		System.out.println("sum = " + sum);
		System.out.println();
		
		System.out.println(i1.equals(Integer.valueOf(10))); //false *Here we compared a reference type to a value of object
		System.out.println();
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		/**
		 * When we use equals() method that's out of Arrays class, it's going to compare
		 * the references and the different objects in them which will result in a {@code false}
		 */
		System.out.println("arr1.equals(arr2) is " + (arr1.equals(arr2))); //false *Each reference are referring to different objects.
		System.out.println();
		
		/**
		 * Now we will use equals() methods in Arrays class to compare object values in the array references.
		 */
		boolean b = Arrays.equals(arr1, arr2);
		System.out.println("Arrays.equals(arr1, arr2) is " + b);
		System.out.println();
		
		/**
		 * We will assign object in the Arrays reference arr2 to Arrays reference arr1, now they're referencing the same object,
		 *  then we will compare them.
		 */
		arr1 = arr2;
		System.out.println("arr1 == arr2 is " + (arr1 == arr2));
		System.out.println("arr1.equals(arr2) now is " + (arr1.equals(arr2)));
		System.out.println();
		
		/**
		 * We're going to do the same for Integer reference types, assign an object in a reference variable to another reference variable.
		 * The results will be true. 
		 */
		Integer i3 = 404;
		i2 = i3;
		System.out.println("i2 == i3 is " + (i2 == i3));
		System.out.println("i2.equals(i3) is " + (arr1.equals(arr2)));
		System.out.println();
		
	}

}
