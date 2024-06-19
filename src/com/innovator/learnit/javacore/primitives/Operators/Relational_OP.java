package com.innovator.learnit.javacore.primitives.Operators;

public class Relational_OP {
	public static void main(String[] args) {
		int a = 4;
		int b = 1;
		boolean c = a < b;
		System.out.println("4 < 1 is " + c);
		boolean d = b != a;
		System.out.println("b != a is " + d);
		float f1 = 7/2;
		float f2 = 7/2.2f;
		boolean bol = f1 == f2;
		System.out.println("(7/2 == 7/2.2f) is " + bol);
		System.out.println("false == true is " + (c == d));
	}
}
