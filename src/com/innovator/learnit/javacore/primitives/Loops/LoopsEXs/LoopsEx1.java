package com.innovator.learnit.javacore.primitives.Loops.LoopsEXs;

import java.util.Scanner;
public class LoopsEx1 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.print("Please, enter any integer: ");
		int N = in.nextInt();
		
		String dig = Integer.toString(N);
		
		int i = 0;
		while(i<dig.length()) {
			System.out.println(dig.charAt(i));
			i++;
		}

	}

}
