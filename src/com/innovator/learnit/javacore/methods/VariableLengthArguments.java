package com.innovator.learnit.javacore.methods;

public class VariableLengthArguments {

	public static void main(String... args) {
		System.out.println(sum(1,2,3,4,5));
		System.out.println(sum(1,2,3));
	}
	
	private static int sum(int i1, int i2, int i3) {
		int sum = i1 + i2 + i3;
		return sum;
	}
	
	private static int sum(int... i) {
		int sum = 0;
		for(int i1 : i) {
			sum+=i1;
		}
		return sum;
	}

}
