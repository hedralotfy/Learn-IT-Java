package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3_CountingWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String text = in.nextLine();

		String[] textS = text.split("\\W");
		System.out.println(Arrays.toString(textS));
		System.out.println("Amount of words in your text: " + getWordsAmount(text));
	}

	// Hedra's Solution
	public static int getWordsAmount(String text) {

		int i;
		String[] textS = text.split("\\W");
		int count = 0;
		for (i = 0; i < textS.length; i++) {
			if (textS[i].isBlank())
				continue;
			count++;
		}
		return count;
	}

	// Andrey Piatakha's Solution
//	public static int getWordsAmount(String text) {
//		return text.split("\\W+").length;
//	}
}
