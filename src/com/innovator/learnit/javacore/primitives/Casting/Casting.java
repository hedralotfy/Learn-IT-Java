package com.innovator.learnit.javacore.primitives.Casting;

public class Casting {

	public static void main(String[] args) {

		int i = 237;
		double d = 12.34;
		
		System.out.println("\nConverting int to byte.");
		byte b = (byte) i;
		System.out.println("i and b are " + i + " " + b);
		
		System.out.println("\nConverting double to int.");
		int i2 = (int) d;
		System.out.println("i2 and d are " + i2 + " " + d);
		
		System.out.println("\nConverting double to byte.");
		byte b2 = (byte) d;
		System.out.println("b2 and d are " + b2 + " " + d );
	}

}
