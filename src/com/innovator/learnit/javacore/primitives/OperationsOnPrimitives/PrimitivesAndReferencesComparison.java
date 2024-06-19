package com.innovator.learnit.javacore.primitives.OperationsOnPrimitives;
import java.util.Arrays;

public class PrimitivesAndReferencesComparison {
	public static void main(String[] args) {
		int i = 128;
		int i2 = 128;
		
		System.out.println("i == i2 is " + (i == i2));
		System.out.println("1 == 2 is " + (1 == 2));
		System.out.println("65 != 'B' is " + (65 != 'B'));
		System.out.println();
		
		
		Integer Int = 128;
		Integer Int2 = 128;
		
		System.out.println("(Int == Int2) is " + (Int == Int2)); //false because each of Int and Int2 is referencing difference objects
																 // from the heap memory.
		System.out.println();
		
		
		Integer Int3 = 127;
		Integer Int4 = 127;
		
		System.out.println("(Int3 == Int4) is " + (Int3 == Int4)); //true because each of Int 3 and Int4 are referencing the same value in
		 														   // Integer pool from the heap memory.
		System.out.println();
		
		
		Integer Int5 = new Integer(127);
		Integer Int6 = new Integer(127);
		Integer Int6v2 = 127;
		System.out.println("Int5 == Int6 is " + (Int5 == Int6)); //false because each variable is referencing a different object as 'new'
																 // tells java to allocate memory for a new object in the heap memory.
		System.out.println("Int6 == Int6v2 is " + (Int6 == Int6v2));
		System.out.println();
		
		
		/**
		 * It's recommended to use valueOf method instead of using 'new' keyword
		 * as this way of getting reference to the Integer object can ensure better space usage.
		 * valueOf() returns an Integer instance representing a specified value.
		 */
		Integer Int7 = Integer.valueOf(127);
		Integer Int8 = Integer.valueOf(127);
		
		System.out.println("Int7 == Int8 is " + (Int7 == Int8));
		System.out.println();
		
		
		/**
		 * If we wanted to compare 2 different objects with '==' operators, we can use equals() method
		 * as each reference type has equals() method, equals() method allows us to compare not reference only
		 *  but also values of objects.
		 */
		System.out.println("Int3.equals(Int4) is " + Int3.equals(Int4));
		System.out.println();
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		/**
		 * Arrays is a reference type, so each variable of this type references to an object in the heap memory.
		 *
		 *  Here we are comparing state of objects,
		 *  it evaluates to false because Object implementation
		 *  in Arrays class is different from that in
		 *  Integers class.
		 *  Comparing objects in Arrays class is like comparing references,
		 *  while in Integer class:
		 *  We cast object to Integer type, retrieve and intValue and compare it with another intValue. 
		 */
		
		System.out.println("(arr1 == arr2) is " + (arr1 == arr2)); //false
		System.out.println("arr1.equals(arr2) is " + (arr1.equals(arr2))); //false
		System.out.println();
		/**
		 * We will use the equals method in the Arrays class to compare object values.
		 */
		System.out.println("(Arrays.equals(arr1, arr2))" + (Arrays.equals(arr1, arr2))); //true
		
		arr1 = arr2;
		
		System.out.println("arr1 == arr2 is " + (arr1 == arr2)); //true Here the references are referring to the same object in heap
	}

}
