package com.innovator.learnit.javacore.primitives.Operators;

public class AutoPromotion {

	public static void main(String[] args) {
		byte a = 64,b;
		int i;
		
		i = a << 2;
		b = (byte) (i);
		
		System.out.println("a is " + a);
		System.out.println("i and b are " + i + " & " + b);

	}

}
