package com.innovator.learnit.javacore.primitives.ControlStatements;

public class ControlStatementsEx1 {

	public static void main(String[] args) {

		String Args = String.join(",", args);
		String admin = "Admin";
		String guest = "Guest";
		if (Args.contains(admin) && Args.contains(guest)){
		    System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
		}else if (Args.contains(admin)){
		    System.out.println("Hello, Admin!");
		}else if (Args.contains(guest)){
		    System.out.println("Hello, Guest!");
		}
	}

}
