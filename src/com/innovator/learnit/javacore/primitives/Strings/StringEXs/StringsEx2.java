package com.innovator.learnit.javacore.primitives.Strings.StringEXs;

import java.util.Arrays;
import java.util.Scanner;

public class StringsEx2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your text here: ");
		String inputText = in.nextLine();
		System.out.println("Your Entered text was:");
		System.out.println(Arrays.toString(inputText.split("\\W+")));
		/*
		\p{Lower}   A lower-case alphabetic character: [a-z]
		\p{Upper}   An upper-case alphabetic character:[A-Z]
		\p{ASCII}   All ASCII:[\x00-\x7F]
		\p{Alpha}   An alphabetic character:[\p{Lower}\p{Upper}]
		\p{Digit}   A decimal digit: [0-9]
		\p{Alnum}   An alphanumeric character:[\p{Alpha}\p{Digit}]
		\p{Punct}   Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
		\p{Graph}   A visible character: [\p{Alnum}\p{Punct}]
		\p{Print}   A printable character: [\p{Graph}\x20]
		\p{Blank}   A space or a tab: [ \t]
		\p{Cntrl}   A control character: [\x00-\x1F\x7F]
		\p{XDigit}  A hexadecimal digit: [0-9a-fA-F]
		\p{Space}   A whitespace character: [ \t\n\x0B\f\r]
		
*/
	}

}
