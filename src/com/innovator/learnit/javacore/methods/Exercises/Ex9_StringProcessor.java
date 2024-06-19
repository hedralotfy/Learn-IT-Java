package com.innovator.learnit.javacore.methods.Exercises;

public class Ex9_StringProcessor {
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator()
			+ "peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator()
			+ "james;Derek James;james@gmail.com" + System.lineSeparator() + "jackson;Walter Jackson;jackson@gmail.com"
			+ System.lineSeparator() + "gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		System.out.println(convert1(INPUT_DATA));
		System.out.println(convert2(INPUT_DATA));
	}

	public static String convert1(String input) {
		String[] elements = input
				.split("([A-Z][a-z]{3}[a-z]*\\;[A-Z][a-z]{3}[a-z]*\\;[A-Z][a-z]{3}[a-z]*)|\\;+|(\\r\\n)+");
		String[] filteredElements = filterInput(elements);
		String[][] table = makeTable(filteredElements);
		String convertedElements;
		int i = 0;
		String result = convertedElements = table[i][0] + " ==> " + table[i][2] + System.lineSeparator();
		for (i = 1; i < table.length; i++) {
			convertedElements = table[i][0] + " ==> " + table[i][2] + System.lineSeparator();
			result += convertedElements;
		}
		return result;
	}

	public static String convert2(String input) {
		String[] elements = input
				.split("([A-Z][a-z]{3}[a-z]*\\;[A-Z][a-z]{3}[a-z]*\\;[A-Z][a-z]{3}[a-z]*)|\\;+|(\\r\\n)+");
		String[] filteredElements = filterInput(elements);
		String[][] table = makeTable(filteredElements);
		String convertedElements;
		int i = 0;
		String result = convertedElements = table[i][1] + " (email: " + table[i][2] + ")" + System.lineSeparator();
		for (i = 1; i < table.length; i++) {
			convertedElements = table[i][1] + " (email: " + table[i][2] + ")" + System.lineSeparator();
			result += convertedElements;
		}
		return result;
	}

//	public static String convert1(String input) {
//		String result = "";
//		String[] lines = input.split(System.lineSeparator());
//		for(int i = 1; i < lines.length; i++){
//			String[] wordsInLine = lines[i].split(";");
//			result += wordsInLine[0] + " ==> " + wordsInLine[2] + System.lineSeparator();
//		}
//		return result;
//	}
//	
//	public static String convert2(String input) {
//		String result = "";
//		String[] lines = input.split(System.lineSeparator());
//		for (int i = 1; i < lines.length; i++) {
//			String[] wordsInLine = lines[i].split(";");
//			result += wordsInLine[1] + " (email: " + wordsInLine[2] + ")" + System.lineSeparator();
//		}
//		return result;
//	
//	}

	public static String[][] makeTable(String[] str) {
		int k = 0;
		String[][] table = new String[str.length / 3][3];
		for (int i = 0; i < str.length / 3; i++) {
			for (int j = 0; j < 3; j++) {
				table[i][j] = str[k++];
			}
		}
		return table;
	}

	public static String[] filterInput(String[] str) {
		int filteredIndex = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].isBlank() == false) {
				filteredIndex++;
			}
		}

		String[] filteredInput = new String[filteredIndex];

		for (int i = 0, j = 0; i < str.length; i++) {
			if (str[i].isBlank() == false) {
				filteredInput[j] = str[i];
				j++;
			}
		}
		return filteredInput;
	}

}
