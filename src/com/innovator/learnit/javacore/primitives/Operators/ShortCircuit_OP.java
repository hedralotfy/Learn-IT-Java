package com.innovator.learnit.javacore.primitives.Operators;

public class ShortCircuit_OP {

	public static void main(String[] args) {
		System.out.println("2 > 4 && 2/0 > -1 is " + (2 > 4 && 2/0 > -1));
		System.out.println("2 < 4 || 2/0 > -2 is " + (2 < 4 || 2/0 > -2));
		
	}

}
