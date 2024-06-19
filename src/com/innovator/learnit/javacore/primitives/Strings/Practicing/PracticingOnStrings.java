package com.innovator.learnit.javacore.primitives.Strings.Practicing;

public class PracticingOnStrings {
	public static void main(String args[]) {
		String faulty = "In the string pool, when I'm using string literal in a program, the string is added to string pool";
		String correction = faulty.replace("string", "String");
		System.out.println(correction);
		System.out.println();
		
		System.out.println("Index of letter s in faulty reference is " + faulty.indexOf("s"));
		System.out.println("Last index of letter s in faulty reference is " + faulty.lastIndexOf("s"));
		System.out.println();
		
		System.out.println("index of letter s in faulty reference is " + faulty.indexOf("s"));
		System.out.println();
		
		System.out.println("Does the String literal contains \"I'm\"? " + faulty.contains("I'm"));
		System.out.println("Does the String literal contains \"String\"? " + faulty.contains("String"));
		System.out.println();
		
		System.out.println("Is our String literal empty? " + faulty.isEmpty());
		System.out.println();
		
		System.out.println("Our corrected String literal in uppercase is like \n" + correction.toUpperCase());
		System.out.println("While in lowercase it's like \n" + correction.toLowerCase());
		System.out.println();
		
		System.out.println("Does our faulty String literal start with \"In \"? " + faulty.startsWith("In "));
		System.out.println("Does our faulty String literal end with \"In \"? " + faulty.endsWith("In "));
		System.out.println();
		
		System.out.println("Our faulty String is going to be clean for processing using .strip() method \n" + faulty.strip());
		System.out.println(correction.indexOf("String", 4));
		/*
		 * indexOf(String str, fromIndex) Starts searching for the first specified substring index, and it begins searching for the specified index
		 * beginning from the index fromIndex.
		 * In our example the index fromIndex is 4, our method searches for the first index of our substring "String", which is at index 7
		 * Once it's found, the method returns the index.
		 */
		System.out.println();
		
		String s1 = "Hedra";
		String s2 = new String("Merna");
		String s3 = "is in love with";
		String s4 = " thinks about marriage to ";
		String fact = s3.replace(s3, s4);
		System.out.println("Hedra thinks about love with Merna is " + (fact==s4)); //false
		/**
		 * here we declared fact to be equal to the value of the String literal in the String reference s3 to be replaced by
		 * the value in the String literal in the String reference s4, but not the literals themselves will be replaced.
		 */
		System.out.println();
		
		System.out.println("Hedra thinks about marriage to Merna is " + (fact.equals(s4)));
		/**
		 * But if we compared the values in String literals, we will get true.
		 */
		System.out.println();
		
		System.out.println("Hedra is not the same human as Merna is " + (s1==s2.intern()));
		System.out.println("Hedra is assuming to having different characteristics from Merna is " + s1.equalsIgnoreCase(s2)); //false
		/**
		 * Here we got a false because many letters differed not only one case of the literals,
		 * if only the words were the same in both length and Uni-code points in each String literal, 
		 * but a case that a letter was UpperCase in a literal and another was in LowerCase in the other literal but
		 * the rest are the same .equalsIgnoreCase() method call ignores that case of the parameter given to it and returns true. 
		 */
		String wrongFact = "Egypt is Arabic";
		String trueFact = wrongFact.replace("is ", "is not ");
		System.out.println(trueFact);  //Egypt is not Arabic
		
		String multi = String.join(", ", "Brave", "Embarras", "Workman");
		System.out.println("Hedra is : " + multi + " & Loving");  //Hedra is : Brave, Embarras, Workman & Loving
		
		System.out.println("Hedra".codePointAt(0));  //72
	}

}
