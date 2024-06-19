package com.innovator.learnit.javacore.Enumeration;

import java.util.Scanner;

public class EnumHW {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter A, B, C or D ");
		String message = in.next();

		while(!message.matches("^[Aa]|^[Bb]|^[Cc]|^[Dd]"))
		{
			System.out.print("Enter just A, B, C or D ");
			message = in.next();
		}
		MessageType messageType = MessageType.valueOf(message.toUpperCase());

		System.out.println("Priority of " + message.toUpperCase() + " is " + messageType.getPriority());

	}
}
