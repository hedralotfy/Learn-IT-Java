package com.innovator.learnit.javacore.primitives.Operators;

public class Ternary_OP {

	public static void main(String[] args) {
		int i = 10;
		int k;
		k = i < 0 ? -i : i;
		
		int j = -10;
		int l;
		l = j < 0 ? -j : j;
		
		System.out.println("the absoulte value of " + i + " is " + k);
		System.out.println("the absoulte value of " + j + " is " + l);

	}

}
