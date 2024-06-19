package com.innovator.learnit.javacore.primitives.OperationsOnPrimitives;

import java.math.BigDecimal;
import java.util.Scanner;

public class ReadingUserInputFromConsole {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //We can use System.in to read values from console.
		System.out.print("Enter a word: ");
		String word = in.next();
		System.out.println("The word you entered was " + word);
		
		System.out.print("Enter a number here: ");
		int i2 = in.nextInt();
		System.out.println("Your entered number was " + i2);
		
		System.out.print("Enter a BigDecimal number: ");
		BigDecimal bd = in.nextBigDecimal();
		System.out.println("Your entered BigDecimal was: " + (bd));
		
		System.out.print("Express yourself briefly: ");
		String sentence = in.nextLine();
		System.out.println(sentence);

	}

}
