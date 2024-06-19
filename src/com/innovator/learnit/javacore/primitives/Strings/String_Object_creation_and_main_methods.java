package com.innovator.learnit.javacore.primitives.Strings;

import java.util.Arrays;

public class String_Object_creation_and_main_methods {

	public static void main(String[] args) {
		String s = " Hello ";
		String s2 = " Hello Hello ";
		System.out.println("s.length(): " + s.length()); // 7
		/**
		 * .length() method returns the number of characters in a string.
		 */
		System.out.println("s.contains(\"he\"): " + s.contains(" H")); // true
		/**
		 * .contains() checks if the string object contains the sequence of characters
		 */
		System.out.println("s.isEmpty(): " + s.isEmpty()); // false
		/**
		 * .isEmpty() method checks if the string object contains any characters or no.
		 */
		System.out.println("s.toUpperCase(): " + s.toUpperCase()); // HELLO
		/**
		 * .toUpperCase() method turns all the string object characters to upper case
		 * .toLowerCase() ................................................ lower case
		 */
		System.out.println("s.startsWith(\"H\"): " + s.startsWith("H")); // false
		System.out.println("s.endssWith(\"o\"): " + s.endsWith("o")); // false
		/**
		 * .startsWith() checks if the string object started with a specific sequence of
		 * characters. .endsWith() checks if the string object ended with a specific
		 * sequence of characters.
		 */
		System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL")); // HeLLo
		System.out.println("s2.replace(\"ll\", \"LL\"): " + s2.replace("ll", "LL")); // HeLLo HeLLo
		/**
		 * .replace("character(s)","character(s)") replaces character(s) in the first
		 * parameter with character(s) in 2nd parameter.
		 */
		System.out.println("s.trim(): " + s.trim()); // Hello
		System.out.println("s2.strip(): " + s2.strip()); // Hello Hello
		/**
		 * .trim() & .strip() remove leading and trailing spaces in a string object
		 * .trim() is available starting from JDK 8 .strip() is available starting from
		 * JDK 11 Both methods are used for cleaning the string object before doing
		 * processes on it.
		 */
		// 8-1-2024
		System.out.println("\"Hamburger\".substring(4, 8): " + "Hamburger".substring(4, 8));
		/**
		 * Returns a string that is a substring of this string. The substring begins at
		 * the specified beginIndex and extends to the character at index endIndex - 1.
		 * Thus the length of the substring is endIndex - beginIndex. To get the
		 * substring from string object, I specify characters index from index
		 * inclusively to index exclusively.
		 */
		System.out.println("Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes()));
		/**
		 * Arrays.toString(s.getBytes()) gets array of bytes from String object.
		 */
		System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray()));
		/**
		 * Arrays.toString(s.toCharArray()) gets array of Characters from String object.
		 */
		System.out.println("s.charAt(2): " + s.charAt(2));
		/**
		 * s.charAt(int index) gets a character at a specific index from the string
		 * object.
		 */
		System.out.println("Arrays.toString(\"the bulldozer hits the tree\".split(\"the\")): "
				+ Arrays.toString("the bulldozer hits the tree".split("the")));
		/**
		 * .split() method takes a regular expression as an argument. it splits an
		 * expression from a string.
		 */

//------------------------------------------------------------------------------------------------------------------------------------------------------

		System.out.println();
		System.out.println("====== String comparison ======");
		System.out.println();

		String s22 = " Hello ";
		System.out.println("(s == s22) is " + (s == s22)); // true
		/**
		 * In the String pool, when I'm using String literal in a program, the String is
		 * added to the pool of strings, and the next time I'm using the same String
		 * literal in a different reference variable, Java checks, whether such String
		 * already exists in the String pool. If there were a match between String
		 * literals, Java returns reference to the object that's already in heap memory
		 * without creating new one, so when we compared the references, we got a true.
		 * TO BE STUDIED.
		 */

		String s3 = new String(" Hello ");
		System.out.println("(s==s3) is " + (s == s3)); // false
		/**
		 * In case we use "new" keyword, we tell Java to allocate memory to create new
		 * object in heap memory, if we compared a String reference to another String
		 * reference but created with "new" keyword, no matter if their String literals
		 * are the same or not, but the result will be false only if we used the ==
		 * operator.
		 */
		System.out.println("s.equals(s3) is " + s.equals(s3)); // true
		/**
		 * Just like any reference type, String reference type has its own .equals()
		 * method to compare the String literal values, in this case if s and s22 ,
		 * which are in the String pool, are compared using the method or s and s3, s is
		 * in String pool and s3 is in the heap memory, only their literal values will
		 * be compared and in this case it will be true in both cases, regardless of the
		 * fact that s3 is created with "new".
		 */
		System.out.println("s==s3.intern() is " + (s == s3.intern())); // true
		/**
		 * !!A Trick!! If I compare s with result of intern() method call on s3 using
		 * "==" operator, here I will get true. intern() method puts s3 String in the
		 * String pool and return the reference to its object in the String pool, and in
		 * this case I will get true; because I'm comparing references to the same
		 * object this means that such String exist in the String pool.
		 */

		String s4 = new String(" hello ");
		System.out.println("s.equals(s4) is " + (s.equals(s4)));
		/**
		 * As we have 2 String literals with different String values, when calling
		 * .equals(Object anObject) on them for comparison, we will get false as they
		 * have different values.
		 */
		System.out.println("s.equalsIgnoreCase(s4) is " + (s.equalsIgnoreCase(s4)));
		/**
		 * To get the result I'm expecting I should ignore the different character from
		 * each string, as the literals containing the same word but a letter in a word
		 * is in upper case but is lower case in another. to do this I will have to use
		 * equalsIgnoreCase(Object anObject) which ignores case when comparing 2
		 * Strings. It compares a String to another String, ignoring case
		 * considerations. Two strings are considered equal ignoring case if they are of
		 * the same length and corresponding Unicode code points in the two strings are
		 * equal ignoring case.
		 */
	}
}