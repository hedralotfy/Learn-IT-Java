package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;

public class Ex10_TurningFirstWordLetterIntoCapital {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter any text ");
		String inputText = in.nextLine();

		System.out.println(firstCharToTitleCase(inputText));

	}

	public static String firstCharToTitleCase(String string) {
		char[] textUnit = string.toCharArray();
		String[] stringUnits = new String[textUnit.length];

		for (int i = 0; i < textUnit.length; i++) {
			if (Character.isLetter(textUnit[i])) {
				stringUnits[i] = (String.valueOf(textUnit[i])).toLowerCase();
			} else {
				stringUnits[i] = String.valueOf(textUnit[i]);
			}
		}

		String[] targetElements = new String[stringUnits.length];

		for (int i = 0; i < targetElements.length; i++) {
			boolean elementCheck = stringUnits[i].matches("[a-z]") ;
			boolean precedingElementCheck = i > 0 && stringUnits[i - 1].matches("[a-z]");
			if (elementCheck  && i == 0|| precedingElementCheck == false && elementCheck) {
				targetElements[i] = stringUnits[i].toUpperCase();
			} else {
				targetElements[i] = stringUnits[i];
			}
		}
		String targetText = String.join("", targetElements);
		return targetText;
	}

}
