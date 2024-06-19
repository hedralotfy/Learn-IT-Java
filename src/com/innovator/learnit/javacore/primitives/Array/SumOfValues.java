package com.innovator.learnit.javacore.primitives.Array;

import java.util.Arrays;

public class SumOfValues {

	public static void main(String[] args) {
		int[] A_value = {3,1,5,2,7};
		int sum = 0;
		int i;
		System.out.println(Arrays.toString(A_value));
		for(i=0; i<5; i++)
			sum = sum + A_value[i];
		System.out.println("Sum is " + sum);

	}

}
