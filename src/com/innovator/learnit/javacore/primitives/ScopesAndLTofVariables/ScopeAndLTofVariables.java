package com.innovator.learnit.javacore.primitives.ScopesAndLTofVariables;

public class ScopeAndLTofVariables {

	public static void main(String[] args) {

		int x = 10;
		if (x == 10) { // Starts a new scope
			int y = 20; // known only to the scope
			// x and y both known here.
			System.out.println("x and y are " + x + " " + y);
			x = y * 2;
		}

		// y = 100; Error! y is not visible here.

		System.out.println("x is " + x);

		printToConsole();

		{ // creates a new scope.
			// int x = 1; //This is illegal - Compile time error - x is already declared
			// defined!
		}
	}

	private static void printToConsole() {
		int x2;
		for (x2 = 0; x2 < 3; x2++) {
			int y2 = -1; // y is initialized each time we enter the block.
			System.out.println("y2 is " + y2); // this always prints -1
			y2 = 100;
			System.out.println("y2 now is " + y2);
		}
	}
}
