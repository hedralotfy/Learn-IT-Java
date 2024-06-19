package com.innovator.learnit.javacore.primitives.AutoTypePromotion;

public class AutoTypePromotion {

	public static void main(String[] args) {
		int a = 50;
		int b = 40;
		int c = 100;
		byte by = (byte) (a * b / c);
		System.out.println("by is " + by);

		byte a2 = 50;
		byte b2 = 40;
		byte c3 = 100;
		int i = a2 * b2 / c3;
		System.out.println("int i " + i);

		// a2 = a2*2 //Error! cannot assign an int to a byte;
		// because operands are automatically promoted to int.
		a2 = (byte) (a2 * 2);

		byte ba = 10;
		char ca = 'a';
		short sha = 150;
		int ia = 50000;
		float fa = 5.67f;
		double da = .1234;
		double result = (ba + ca) / (fa * da) - (ia % sha);
		System.out.println((ba + ca) + " / " + (fa * da) + " - " + (ia % sha));
		System.out.println("result = " + result);

	}

}
