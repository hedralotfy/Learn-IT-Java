package com.innovator.learnit.javacore.primitives.Operators;

public class IncDec {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c;
		int d;
		
		c = ++b;
		/*
		 * b = b + 1
		 * c = b
		 */
		d = a++;
		/*
		 * d = a
		 * a = a + 1
		 */
		c++;
		// c = c + 1
		
		System.out.println("a = " + a); // a = 2
		System.out.println("b = " + b); // b = 3
		System.out.println("c = " + c); // c = 4
		System.out.println("d = " + d); // d = 1

	}

}
