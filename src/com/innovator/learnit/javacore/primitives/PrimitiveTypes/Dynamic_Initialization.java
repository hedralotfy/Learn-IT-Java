package com.innovator.learnit.javacore.primitives.PrimitiveTypes;

/**
 * Demonstration of dynamic initialization
 * @param args
 */
public class Dynamic_Initialization {

	/**
	 * Demonstration of dynamic initialization
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 3.0, b = 4.0;
		
		//c is dynamically initialized.
		double c = Math.sqrt(a * a + b * b);
		
		System.out.println("Hypotenous of the triangle is " + c);
	}

}
