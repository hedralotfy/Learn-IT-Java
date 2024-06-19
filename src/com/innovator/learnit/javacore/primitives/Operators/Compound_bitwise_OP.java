package com.innovator.learnit.javacore.primitives.Operators;

public class Compound_bitwise_OP {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		a <<= 1;
		/*
		 * 1(a) * 2^1 = 2
		 * 0001
		 * <<
		 * 0010
		 */
		b >>= 1;
		/*
		 * 2(b) / 2^1 = 1
		 * 0010
		 * <<
		 * 0001
		 */
		c <<= a;
		/*
		 * 3(c) * 2^2 = 12 
		 * 00000010
		 * <<
		 * 00001100
		 */
		a ^= c;
		/*
		 * 0010
		 * ^^^^
		 * 1100
		 * ----
		 * 1110 (14)
		 */
		int a2 = a;
		int b2 = b;
		int c2 = c;
		a2 >>= 2;
		b2 |= 1;
		c2 >>= 1;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println();
		
		System.out.println("a2 = " + a2);
		System.out.println("b2 = " + b2);
		System.out.println("c2 = " + c2);
		
		a = (a >> b) + 3;
		a = a >> (b + 3);
	}
}
