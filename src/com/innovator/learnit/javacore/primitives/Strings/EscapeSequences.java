package com.innovator.learnit.javacore.primitives.Strings;

public class EscapeSequences {
	
	public static void main(String[] args) {
		System.out.println("I read the book \"Dark psychology\" by James Williams");
		
		/*
		 * \t - tab.
		 * \b - backspace (a step backward in the text or deletion of a single character).
		 * \n - new line.
		 * \r - carriage return. ()
		 * \f - form feed.
		 * \' - single quote.
		 * \" - double quote.
		 * \\ - backslash.
		 */
		
		System.out.println("the source code is in the following path: \n "
				+ "G:\\Eclipse\\Learnit-fundamentals\\Learn IT - Java Core\\bin\\com\\innovator\\learnit\\javacore\\primitives\\Strings");
		System.out.println("I read the book \"Dark psychology\" by James Williamss\b");
		System.out.println("Imma \rtell \ryou \ra \rsecret \rI love a girl");
		System.out.println("Imma tell you \fA secret I love a girl");
	}

}
