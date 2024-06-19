package com.innovator.learnit.javacore.primitives;

public class Boolean_Logical_OP {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c = a & b;
		boolean d = a | b;
		boolean e = (!a & b) | (a & !b);
		boolean f = !a;
		boolean g = a ^ b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("a & b = " + c);
		System.out.println("a | b = " + d);
		System.out.println("(!a & b) | (a & !b) = " + e);
		System.out.println("!a = " + f);
		System.out.println("a ^ b = " + g);
		int w;
		int x;
		int y;
		int z;
		w = x = y = z = 100;
		if(y == 100 & w++ > 100)z = 200;
		System.out.println(z);
		
	}
}
