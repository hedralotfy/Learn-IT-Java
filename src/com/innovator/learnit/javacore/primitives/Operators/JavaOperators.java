package com.innovator.learnit.javacore.primitives.Operators;

public class JavaOperators {
	public static void main(String[] args) {

		System.out.println("===== Unary Arithmetic operators =====");
		System.out.println();

		int i = +10;
		int i2 = -10;
		int i3 = ++i; // 11
		int i4 = ++i; // 12
		int i45 = ++i; // 13
		int i5 = --i; // 12
		int i6 = i--; // 12
		int i7 = i; // 11

		System.out.println("i is " + i);
		System.out.println("i2 is " + i2);
		System.out.println("i3 is " + i3);
		System.out.println("i4 is " + i4);
		System.out.println("i45 is " + i45);
		System.out.println("i5 is " + i5);
		System.out.println("i6 is " + i6);
		System.out.println("i7 is " + i7);
		System.out.println("i is " + i);
		System.out.println();

		System.out.println("===== Binary Arithmetic operators =====");
		System.out.println();

		int i8 = i7 - 1; // 10
		int i9 = i8 + 5; // 15
		int i10 = i9 * 2; // 30
		int i11 = i10 / 2; // 15
		int i12 = i11 % 2; // 1
		int i13 = 5 % 10; // 5. In this case, the result is the same as
							// the left hand operand as it's less than
							// the right hand operand.

		System.out.println("i8 is " + i8);
		System.out.println("i9 is " + i9);
		System.out.println("i10 is " + i10);
		System.out.println("i11 is " + i11);
		System.out.println("i12 is " + i12);
		System.out.println("i13 is " + i13);
		System.out.println("Hello" + " World" + "!");

		System.out.println();
		System.out.println("===== Assignment operators =====");
		System.out.println();

		int i14 = 2;
		i14 += 5;
		int i15 = 15;
		i15 -= 5;
		i15 *= 2;
		i15 /= 4;
		i15 %= 2;

		System.out.println("i14 is " + i14);
		System.out.println("i15 is " + i15);

		System.out.println();
		System.out.println("===== Relational operators =====");
		System.out.println();

		// ==
		// !=
		// >
		// <
		// >=
		// <=

		int i16 = 15;
		int i17 = 15;

		System.out.println("15 == 15 is " + (i16 == i17));
		System.out.println("15 != 15 is " + (i16 != i17));
		System.out.println("15 > 15 is " + (i16 > i17));
		System.out.println("15 < 15 is " + (i16 < i17));
		System.out.println("15 >= 15 is " + (i16 >= i17));
		System.out.println("15 <= 15 is " + (i16 <= i17));
		System.out.println("(15/2) > (12+3) is " + ((15 / 2) > (12 + 3)));

		System.out.println();
		System.out.println("===== Logical operators =====");
		System.out.println();

//		&  Evaluates both operands and it will return true if both operands are true.
//		&&  Short circuit And, if an operand is false; the expression is false, no matter what next operand is.
//		|
//		||
//		!
//		^

//		System.out.println(false & (5 / 0 == 0));
		System.out.println(false && (5 / 0 == 0));
//		System.out.println(true | (5 / 0 == 0));
		System.out.println(true || (5 / 0 == 0));
		System.out.println("!true is " + !true);
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println(false ^ true);

		System.out.println();
		System.out.println("===== Bitwise operators =====");
		System.out.println();

//		&
//		|
//		^
//		~
//		>>   Bitwise right shift	x >> y = x / (2 ^ y)
//		>>>  Unsigned right shift	
//		<<   Bitwise right shift	x << y = x * (2 ^ y)

		/*
		 * 1 0 1 & & & 1 0 0 ======= 1 0 0 = 4
		 */
		System.out.println("(4&5) = " + (4 & 5));
		System.out.println("(3&7) = " + (3 & 7));

		/*
		 * 1 0 1 | | | 1 0 0 ======= 1 0 1 = 5
		 */
		System.out.println("(4|5) = " + (4 | 5));
		System.out.println("(3|7) = " + (3 | 7));

		/*
		 * 1 0 1 ^ ^ ^ 1 0 0 ===== 0 0 1 = 1
		 */
		System.out.println("(5^3) = " + (5 ^ 4));
		System.out.println("(3^7) = " + (3 ^ 7));

		System.out.println("~4 = " + (~4)); // -(2^7)+(2^6)+(2^5)+(2^4)+(2^3)+0+(2^1)+(2^0)

		/*
		 * ~0 ~0 ~0 ~0 ~0 ~1 ~0 ~0 ~(4) =============== 1 1 1 1 1 0 1 1 = -5
		 */

		System.out.println("~1 = " + (~1));
		System.out.println("~2 = " + (~2));
		System.out.println("~0 = " + (~0));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(-2));
		System.out.println(Integer.toBinaryString(128));
		System.out.println((byte)0b11111110);
		System.out.println((byte)0b10000000);
		System.out.println((byte)0b11000000);
		
		System.out.println("5 = " + 0b101);
		System.out.println("5 >> 1 = " + (5 >> 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));  // 101
		System.out.println("2 in binary format = " + Integer.toBinaryString(2));  // 10
				
		System.out.println("5 = " + 0b101);
		System.out.println("5 >>> 1 = " + (5 >>> 1));
		
		int NegativeByteValue = 0b11111111111111111111111110000000;
		System.out.println("-128 = " + NegativeByteValue);	//11111111111111111111111110000000
		System.out.println("-128 >>> 1 = " + (NegativeByteValue >>> 1));	//01111111111111111111111110000000
		System.out.println("-128 >> 1 = " + (NegativeByteValue >> 1));	//111111111111111111111111110000000
		
		System.out.println("5 = " + 0b101);
		System.out.println("5 << 1 = " + (5 << 1));
		System.out.println("5 in binary format = " + Integer.toBinaryString(5));  // 101
		System.out.println("10 in binary format = " + Integer.toBinaryString(10));  // 10
		
		System.out.println("10 * 2 = 10 << 1 = " + (10 << 1));	// x << y = x * (2 ^ y)
		System.out.println("10 / 2 = 10 >> 1 = " + (10 >> 1));	// x >> y = x / (2 ^ y)
		
		System.out.println();
//		================Ternary operator
		System.out.println("===== Ternary operator =====");
		System.out.println();
		
		System.out.println(2 > 1 ? "2 is greater than 1" : "2 is not less than 1");
		System.out.println(2 < 1 ? "2 is greater than 1" : "2 is not less than 1");
		
//		============Operators precedence
		
//		
//		()
//		[]
//		.
//		
//		
//		++
//		--
//		
//		
//		+
//		-
//		!
//		~
//		( type )
//		
//		
//		*
//		/
//		%
//		
//		
//		+
//		-
//		
//		
//		<<
//		>>
//		>>>
//		
//		
//		<
//		<=
//		>
//		>=
//		instanceof
//		
//		
//		==
//		!=
//		
//		
//		&
//		
//		
//		^
//		
//		
//		|
//		
//		
//		&&
//		
//		
//		||
//		
//		
//		? :
//			
//			
//		=
//		+=
//		-=
//		*=
//		/=
//		%=
		
	}
}
