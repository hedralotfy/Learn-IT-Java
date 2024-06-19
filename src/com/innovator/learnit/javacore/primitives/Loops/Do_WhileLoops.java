package com.innovator.learnit.javacore.primitives.Loops;

public class Do_WhileLoops {

	public static void main(String[] args)
			throws java.io.IOException {
		// Do-while loops execute a statement at least once, before checking the
		// condition, regardless of whether it was
		// true or false, unlike the while loop, as long as the condition is true, the
		// statement(s) in loop body will be executed
		// otherwise, body will be skipped.
		int counter = 0;
		do {
			System.out.println("Counter " + counter++);
		} while (counter < 5);
	
		do {
			System.out.println("Counter is already " + counter++);
		} while (counter < 5);
	
		int n = 10;
		do {
			System.out.println("Tick " + n);
		} while (--n > 0); // In the while loop condition, the n is decremented, then new returned value is
							// compared
							// with 0
		char choice;
		do {
			System.out.println("Help on: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. while");
			System.out.println(" 4. do-while");
			System.out.println(" 5. for\n");
			System.out.println("Choose one:");
			choice = (char) System.in.read();
		} while (choice < '1' || choice > '5');
		System.out.println("\n");

		switch (choice) {
		case '1':
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
		case '2':
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println(" case constant:");
			System.out.println(" statement sequence");
			System.out.println(" break;");
			System.out.println(" //...");
			System.out.println("}");
			break;
		case '3':
			System.out.println("The while:\n");
			System.out.println("while(condition) statement;");
			break;
		case '4':
			System.out.println("The do-while:\n");
			System.out.println("do {");
			System.out.println(" statement;");
			System.out.println("} while (condition);");
			break;
		case '5':
			System.out.println("The for:\n");
			System.out.print("for(init; condition; iteration)");
			System.out.println(" statement;");
			break;

		}
	}

}

