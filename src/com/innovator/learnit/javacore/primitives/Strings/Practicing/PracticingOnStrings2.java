package com.innovator.learnit.javacore.primitives.Strings.Practicing;

import java.lang.reflect.Array;

public class PracticingOnStrings2 {

	public static void main(String[] args) {
		String string = "Java is the best";
		int index1 = string.charAt(0); // getting the ASCII code for the character at index 0.
		int index2 = string.charAt(10); // getting the ASCII code for the character at index 10.
		System.out.println("Original String : " + string);
		System.out.println((char) index1); // Printing the char value at position 0 by converting ASCII value to char.
		System.out.println((char) index2 + "\n"); // Printing the char value at position 10 by converting ASCII value to
													// char.

		// Converting from String to String Array.
		// We convert the String to String Array using .split() method on string with
		// whiteSpace as a delimiter.
		String[] strArray = string.split(" ");
		System.out.println();

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		// getting the unicode point of a character at a specified index.
		System.out.println();
		String str = "w3resource.com";
		System.out.println("Original String : " + str);
		int indo1 = str.codePointAt(0);
		int indo2 = str.codePointAt(10);
		System.out.println("Character(unicode point) = " + indo1);
		System.out.println("Character(unicode point) = " + indo2 + "\n");

		// getting the unicode point of a character before a specified index.
		System.out.println();
		String Str = "I love Java";
		System.out.println("Original String : " + Str);
		int indx1 = Str.codePointBefore(1);
		int indx2 = Str.codePointBefore(11);
		System.out.println("Character(unicode point) = " + indx1);
		System.out.println("Character(unicode point) = " + indx2 + "\n");

		// getting the unicode point count in a specified text range of a String, from
		// beginIndex to endIndex - 1.
		System.out.println();
		String coffee = "I love coffee";
		System.out.println("Original String : " + coffee);
		int ind1 = coffee.codePointCount(0, 10);
		System.out.println("Codepoint count = " + ind1 + "\n");

		String text1 = "This is text1";
		String text2 = "This is text2";
		System.out.println("String 1: " + text1 + "\n");
		System.out.println("String 2: " + text2 + "\n");
		int equality = text1.compareTo(text2);

		if (equality > 0) {
			System.out.println("\"This is text 1\" is bigger than \"This is text2\"\n");
		} else if (equality == 0) {
			System.out.println("\"This is text 1\" is equal to \"This is text2\"\n");
		} else if (equality < 0) {
			System.out.println("\"This is text 1\" is less than \"This is text2\"\n");
		}
		/*
		 * ASSIGNMENT: Write how I compared 2 strings lexicographically using
		 * compareTo() method from String class.
		 * 
		 * -If we compared two Strings lexicographically, this means we compare them
		 * using the Unicode value of each character in each String.
		 * 
		 * -The character sequence represented in a String object is compared
		 * lexicographically to the character sequence represented by the argument
		 * String.
		 * 
		 * -If the value of comparison was a positive value, this String object
		 * lexicographically preceded the argument String.
		 * 
		 * -If the value of comparison was a zero, this String object lexicographically
		 * equal to the argument String, compareTo() method will return 0 exactly when
		 * equals(Object) returns true.
		 * 
		 * -If the value of comparison was a negative value, this String object
		 * lexicographically precedes the argument String.
		 * 
		 * -This is the definition of lexicographic ordering. If two strings are
		 * different, then either they have different characters at some index that is a
		 * valid index for both strings, or their lengths are different,or both. If they
		 * have different characters at one or more index positions, let k be the
		 * smallest such index; then the string whose character at position k has the
		 * smaller value, as determined by using the < operator, lexicographically
		 * precedes the other string. In this case, compareTo returns the difference of
		 * the two character values at position k in the two Strings.
		 */

		String t1 = "This is exercise 1";
		String t2 = "This is Exercise 1";

		System.out.println("Original String : " + t1);
		System.out.println("Original String : " + t2);

		int comparison = t1.compareToIgnoreCase(t2);

		if (comparison > 0) {
			System.out.println("\"This is exercise 1\" is bigger than \"This is Exercise 1\"\n");
		} else if (comparison == 0) {
			System.out.println("\"This is exercise 1\" is equal to \"This is Exercise 1\"\n");
		} else if (comparison < 0) {
			System.out.println("\"This is exercise 1\" is less than \"This is Exercise 1\"\n");
		}

		/*
		 * compareToIgnoreCase(String string) compares two strings lexicographically,
		 * ignoring case differences. it returns an integer whose sign is that of
		 * calling compareTo() with case folded versions of the strings, where case
		 * differences have been eliminated by calling
		 * Character.toLowerCase(Character.toUpperCase()) on each Unicode code point.
		 */
		
		String t3 = "PHP Exercises and ";
		String t4 = "Python Exercises";
		
		System.out.println("String 1 : " + t3);
		System.out.println("String 2 : " + t4);
		
		String concatenated = t3.concat(t4);
		
		System.out.println("The concatenated String: " + concatenated + "\n");
		
		
		String t5 = "PHP Exercises and Python Exercises";
		System.out.println("Original String: " + t5);
		String str1 = "and";
		System.out.println("Specified sequence of char values: " + str1);
		
		boolean me = t5.contains(str1);
		System.out.println(me);

	}
}
