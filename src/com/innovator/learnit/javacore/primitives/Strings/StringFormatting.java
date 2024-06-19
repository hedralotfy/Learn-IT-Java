package com.innovator.learnit.javacore.primitives.Strings;

public class StringFormatting {

	public static void main(String[] args) {
		String Greeting = "Good %s, %s! how are you?";
		String firstName = "Hedra";
		String Morning = "Morning";
		String Afternoon = "Afternoon";
		String Evening = "Evening";
		
		String Welcome = String.format(Greeting, Morning, firstName);
		System.out.println(Welcome);

		System.out.printf("You have %d$, Congratulations!", 100000);
		
	}

}
