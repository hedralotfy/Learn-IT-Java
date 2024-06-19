package com.innovator.learnit.javacore.primitives.BooleanDataType;

public class BooleanDataType {
	public static void main(String[] args) {
		boolean b1 = false;
		System.out.println(b1);
		b1 = true;
		System.out.println(b1);
		
		if(b1)
			System.out.println("This is executed");
		b1 = false;
		if(b1)
			System.out.println("This is not executed");
		
		System.out.println("10 > 9 is " + (10 > 9));
	}
}
