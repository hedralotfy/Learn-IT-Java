package com.innovator.learnit.javacore.primitives.Strings.StringEXs;

import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
public class RegularExpressionEx {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String namePattern = "[a-zA-Z]+";
		System.out.print("Define yourself. ");
		String someText = in.nextLine();
		Pattern p = Pattern.compile(namePattern);
		
		Matcher m = p.matcher(someText);
		
		m.find();
		String Name = m.group();
		System.out.println(Name);

		String WrongFact = "Egypt is ARABIAN Great";
		String[] TrueFact = WrongFact.split("( ARABIAN )");
		System.out.println(Arrays.toString(TrueFact));
	}

}
