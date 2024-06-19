package com.innovator.learnit.javacore.primitives.Loops;

public class WhileLoops {

	public static void main(String[] args) {
		int i = 0;
		while (i < 5) // while statement(s) is repeated as long as the controlling expression is true.
			System.out.println("Count " + i++); // Here count will be printed with the value of i, then i will be
												// incremented
												// for the next iteration.

		int i2 = 0;
		while (i2 < 5) {
			System.out.println("Coun " + ++i2);
		}
		int i3 = 100;
		int j3 = 200;
		while (++i3 < --j3)
			;
		System.out.println("midpoint = " + i3);
	}

}
