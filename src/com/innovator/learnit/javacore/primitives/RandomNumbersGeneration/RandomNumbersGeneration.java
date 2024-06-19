package com.innovator.learnit.javacore.primitives.RandomNumbersGeneration;

import java.util.Random;

public class RandomNumbersGeneration {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		System.out.println(r.nextInt());  //any random int.
		System.out.println(r.nextBoolean());  //any random boolean.
		System.out.println(r.nextDouble());  //any random double.
		System.out.println(r.nextFloat());  //any random float.
		System.out.println(r.nextInt(100));  //any random int 0 to 99.
		System.out.println(r.nextInt(100)+1);  //any random int from 0 to 100.

		System.out.println(r.nextInt(5, 25));
	}

}
