package com.innovator.learnit.javacore.primitives.Strings;

import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.regex.Matcher;
public class RegularExpressions {

	public static void main(String[] args) {
		String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
		/**
		 * I will describe the search pattern using special symbols like:
		 * [] - to identify characters which we need to search.
		 * The special -(dash) character - to specify the range of characters.
		 * \\d is for matching with all digits.
		 * As well as the +(plus) sign, it can be read like this:
		 * In case the specified characters will be repeated at
		 * least one time and more, we will need the specified characters
		 * in the squared brackets.
		 * Also we have .(dot) character, if it came in a regular expression,
		 * it means ANY CHARACTER.
		 * Here, we need to escape dot to say that we don't expect ANY CHARACTER,
		 * but exactly a dot is what are we looking for. 
		 */
		Pattern p = Pattern.compile(gmailPattern);
		String sampleText = "Some random text that includes gmail adresses "
				+ "like this one HeroFoty@gmail.com. And some other random text.";
		Matcher m = p.matcher(sampleText);
		
		m.find();
		String gmailAddress = m.group();
		System.out.println(gmailAddress);
		
		String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
		String excludedCharacters = "[\\.?!]";
		/**
		 * Here, we want to exclude some specified characters:
		 * .,?,! and that's specified by the \\
		 */
		// "\\" in this source code stands for all included characters, digits, etc.
		String[] sentences = sampleText2.split(excludedCharacters);
		System.out.println(Arrays.toString(sentences));

	}

}
