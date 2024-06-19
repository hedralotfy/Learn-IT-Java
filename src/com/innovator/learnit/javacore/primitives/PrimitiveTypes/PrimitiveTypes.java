package com.innovator.learnit.javacore.primitives.PrimitiveTypes;

public class PrimitiveTypes {

	public static void main(String[] args) {
		byte b = 127;
		
		short s = 20;
		
		int i = 35;
		
		long l = 1000000;
		
		long l2 = 10_000_000_000_000L;
		System.out.println(l2);
		
		float f = 10.0F;
		
		double d = 2.1;
		
		boolean bool = true;
		
		char c = 100;
		System.out.println(c);
		
		char c2 = 'a';
		System.out.println(c2);
		
		byte b2 =(byte) 1000;
		System.out.println(b2);
		
		byte b3 = (byte) 128;
		System.out.println(b3);
		
		long l3 = 499_999_999_000_000_001L;
		System.out.println("Long is " + l3);
		double d2 = l3;
		System.out.println("Converted is "+ d2);
		System.out.println(l3-(long)d2);
		
		double d3 = i;
		d2 = l;
		
		//Autoboxing and unboxing
		
		Integer I= 1;
		int i2 = I;
		
		Double D = 45.3;
		double d4 = D;

		//var datatype
		
		var v = 1;
		
		double me = 156;
		
		char ca = 35500;
		System.out.println(ca);
		
		float fa = (float)244444.5547;
		double da = fa;
		System.out.println(da-(float)fa);
		
		double da2 = 234.234;
		float fa2 = (float) da2;
		System.out.println((double)da2-fa2);
		
		float fmin = Float.NEGATIVE_INFINITY;
		float fmax = Float.POSITIVE_INFINITY;
		System.out.println("Long: " + (long)fmin + ".." + (long)fmax);
		System.out.println("Int: " + (int)fmin + ".." + (int)fmax);
		System.out.println("Short: " + (short)fmin + ".." + (short)fmax);
		System.out.println("Byte: " + (byte)fmin + ".." + (byte)fmax);
		System.out.println("Char: " + (int)(char)fmin + ".." + (int)(char)fmax);
		
		int CtoI = 'A';
		System.out.println("From Char to int, A is " + CtoI);
		
		boolean Bool = true;
		boolean Bool2 = false;
		System.out.println(Bool);
		System.out.println(Bool2);
	}

}
