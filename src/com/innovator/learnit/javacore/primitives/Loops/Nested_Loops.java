package com.innovator.learnit.javacore.primitives.Loops;

public class Nested_Loops {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			System.out.println("*** i = " + i + " ***");
			for(int j = 0; j<3; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

}
