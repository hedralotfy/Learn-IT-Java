package com.innovator.learnit.javacore.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_code {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter any text ");
		String inputText = in.nextLine();
		String[] textElements = inputText.split("\\W+");
		
		System.out.println(Arrays.toString(textElements));
		
	}

}
