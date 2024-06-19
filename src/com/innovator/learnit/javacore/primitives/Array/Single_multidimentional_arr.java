package com.innovator.learnit.javacore.primitives.Array;

import java.util.Arrays;

public class Single_multidimentional_arr {

	public static void main(String[] args) {
		int[] arr;
		int arr2 [];
		
		arr = new int[10];
		System.out.println(arr[0]);
		arr2 = new int[10];
		System.out.println(arr2[0]);
		
		double[] arr3 = new double[5];
		System.out.println(arr3[0]);
		double arr4[] = new double[5];
		System.out.println(arr4[0]);
		
		boolean[] bola = new boolean[14];
		System.out.println(bola[0]);
		System.out.println(bola[13]);
		
		int[] arr5 = {3,2,1};
		System.out.println(arr5[2]);
		
		//in multidimentional array, the first index represents the rows
		//and the second represents the columns
		double[][] matrix = {
				{0,1,2},
				{3,4,5},
				{6,7,8}
				};
		
		System.out.println(matrix[0][2]);
		
		double[][] matrix2 = new double[10][];
		System.out.println("Index 2 in row 1 in matrix2 is "+ matrix2[2]);
		matrix2 = new double[10][5];
		System.out.println("Index 2 in row 1 in matrix2 now is " + matrix2[2]);
		
		System.out.println(Arrays.toString(arr5));
		Arrays.sort(arr5);
		System.out.println(Arrays.toString(arr5));
		System.out.println(arr5.length);
	}

}
