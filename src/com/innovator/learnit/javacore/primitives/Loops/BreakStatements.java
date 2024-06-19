package com.innovator.learnit.javacore.primitives.Loops;

public class BreakStatements {

	public static void main(String[] args) {
		/*
		 * break; statement stops the execution of the current loop, so the compiler
		 * executes the rest of the code. continue; statement stops the execution of the
		 * current iteration, so the compiler recheckes the condition of the loop to
		 * start a new iteration.
		 */
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("Counter is " + i);
		}

		System.out.println();
		System.out.println("======== break");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			if (i == 3)
				break;
			System.out.println("Counter is " + i);
		}

		System.out.println();
		System.out.println("======== break nested loop");
		System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3)
					break;
				System.out.print(j + " ");
			}
			System.out.println("Counter " + i);
		}

	}

}
