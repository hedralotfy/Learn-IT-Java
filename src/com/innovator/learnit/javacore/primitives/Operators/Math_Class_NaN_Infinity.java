package com.innovator.learnit.javacore.primitives.Operators;

public class Math_Class_NaN_Infinity {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.sqrt(4.0));
		System.out.println(Math.max(1, 5));
		System.out.println(Math.min(1, 5));
		System.out.println(Math.abs(-25));
		System.out.println();
		
		System.out.println(Math.sqrt(-1));
		System.out.println(0 / 0.0);
		System.out.println((0 / 0.0) + 5);
		System.out.println();
		
		System.out.println(5.6 / 0.0f);
		System.out.println(100 / 0.0);
		System.out.println();
		
		System.out.println(Math.round(45.415/3.3355));
		System.out.println(Math.round((100.0/5.5) + 10.45));
		System.out.println();
		
		System.out.println(Math.random());
		System.out.println(Math.random()*100); // from 0 to 100
		System.out.println((int)Math.random()*50); // from 0 to 50
		System.out.println(((int)(Math.random()*100) + 100)); // from 100 to 200
		System.out.println(((int)(Math.random()*100) - 50)); // -50 to 50
		System.out.println((int)Math.random()-30);
		System.out.println();
		
		int n1 = 11;
		double n2 = 0.0;
		System.out.println(n1/n2);
		System.out.println(n2/0.0);
		System.out.println(12.0/0.0);
		System.out.println("When we divide a 0 by floating point 0.0 (0/0.0), it gives us " + 0/0.0f);
		System.out.println("When we divide 14 by a floating point 0.0, (14/0.0) it gives us " + 14/0.0);
		
	}
}
