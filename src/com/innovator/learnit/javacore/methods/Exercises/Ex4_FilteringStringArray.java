package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4_FilteringStringArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a text with spaces here please: ");
		String text = in.nextLine();

		String[] strText = text.split("\\s+");

		System.out.print("Enter minimum length of words ");
		int wordLength = in.nextInt();

		String[] filteredWords = filterWordsByLength(wordLength, strText);
		System.out.println(Arrays.toString(filteredWords));
	}

	public static String[] filterWordsByLength(int minLength, String[] str) {
		String[] wordsArr = new String[str.length];
		int newArraySize = 0;
		for (int i = 0, j = 0; i < str.length; i++) {
			if (str[i].length() >= minLength) {
				wordsArr[j] = str[i];
				j++;
				newArraySize++;
			}
		}

		String[] filteredWords = new String[newArraySize];

		for (int i = 0; i < filteredWords.length; i++) {
			filteredWords[i] = wordsArr[i];
		}

		return filteredWords;
	}

}
