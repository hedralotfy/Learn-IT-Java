package com.innovator.learnit.javacore.primitives.Char_Data_Type;

//Demonstrate char data type

public class Char_data_type {

	public static void main(String[] args) {
		char Ch1 = 88; //Code for X
		char Ch2 = 'Y';
		System.out.print("Ch1 and Ch2 are: ");
		System.out.println(Ch1 + " " + Ch2);
		
		//char variables act like integers.
		System.out.println("Ch1 is " + Ch1);
		Ch1++;
		System.out.println("Ch1 now is " + Ch1);
		
		//Adding char to another
		char Ch3 = (char)(Ch1 + Ch2);
		System.out.println("Ch3 is " + Ch3);
		
		//7-11-2023
		
		/* implementation of characters in octal notation */
		
		char cho = '\141';
		System.out.println("cho is " + cho);
		char cho2 = '\121';
		System.out.println("cho2 is " + cho2);
		char cho3 = '\123';
		System.out.println("cho3 is " + cho3);
		
		/*implementation of characters in hexadecimal notation */
		char ch2 = '\u8800';
		System.out.println("ch2 is " + ch2);
		char ch3 = '\u0061';
		System.out.println("ch3 is " + ch3);
		
		/*Japanese Katakana character*/
		char Nippon = '\ua432';
		System.out.println("Nippon is " + Nippon);
		char danji = '\ua423';
		System.out.println("danji is " + danji);
		
		int chaw = Ch1 + Ch2;
		System.out.println("chaw is " + chaw);
		
		char chawa = 178;
		System.out.println("chawa is " + chawa);

	}
}
