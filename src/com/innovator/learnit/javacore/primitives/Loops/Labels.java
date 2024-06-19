package com.innovator.learnit.javacore.primitives.Loops;

public class Labels {

	public static void main(String[] args) {
		loop1: for (int i = 0; i < 5; i++) {
			System.out.println("Counter i = " + i + "\t");
			loop2: for (int j = 0; j < 5; j++) {
				System.out.print(j + " ");
				System.out.println("Counter j = " + j);
				if (j >= 0 && j < 3) {
					System.out.println("Continue loop2");
					continue loop2;
				} else {
					System.out.println("Break loop1");
					break loop1;
				}
			}
		}
		/*
		 * Labels are go to statements, go to statements in different programming
		 * languages allow us to pass control to any line in the code without any
		 * condition.
		 * 
		 * The jump 2 lines of code are usually identified by labels.
		 * 
		 * go to statements in Java are reserved keywords but never used, because code which
		 * have them is less readable and harder to maintain. 
		 * 
		 * in Java, there are labels, labels are used to break the loop marked with a 
		 * label or to continue another loop.
		 * 
		 * Labels with break statements are more structured form of goto statements.
		 * 
		 * Labels help us to break the main loop in case of nested loops.
		 * 
		 * Label is any java identifier followed by a colon followed by the loop.
		 */
	}
}
