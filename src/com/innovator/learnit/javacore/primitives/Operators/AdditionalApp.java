package com.innovator.learnit.javacore.primitives.Operators;

public class AdditionalApp {

	public static void main(String[] args) {
		int sum = +10 + +11;
		int sub = +15 + -10;
		int prod = sum * sub;
		int div = prod / 15;
		int modulus = div % 2;

		System.out.println("+10 + +11 = " + sum);
		System.out.println("+15 + -10 = " + sub);
		System.out.println("21 * 5 = " + prod);
		System.out.println("105 / 15 = " + div);
		System.out.println("7 % 2 = " + modulus);

		boolean bobo = 10 > 11;
		boolean b0b0 = prod >= sum;
		boolean b0 = 10 % 2 <= 10 - 10;
		boolean b1 = prod == 10 * 13;
		boolean b2 = prod != 10 * 13;

		System.out.println();
		System.out.println("10 > 11 is " + bobo);
		System.out.println("105 >= 21 is " + b0b0);
		System.out.println("10 % 2 <= 10 - 10 is " + b0);
		System.out.println("105 == 10 * 13 is " + b1);
		System.out.println("105 != 10 * 13 is " + b2);

		int i = 10;
		i += sub; // 15
		int i2 = 15;
		i2 -= 12; // 3
		int i3 = 20;
		i3 /= 2; // 10
		int i4 = 2;
		i4 *= 3; // 6
		int i5 = 1000;
		i5 %= 10; // 0

		System.out.println();
		System.out.println("i = " + i);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		System.out.println("i5 = " + i5);

		System.out.println("105 == 10 * 13 && (15 / 0 == 0) is " + (b1 && (15 / 0 == 0)));
		System.out.println("0 > 3 & 10 % 2 <= 10 - 10 is " + (i5 > i2 & b1));
		System.out.println("0 > 3 || 3 > 15 is " + (i5 > i2 || i2 > i));
		System.out.println("!b1 is " + !b1);
		System.out.println("!b1 ^ !b0b0 is " + (!b1 ^ !b0b0)); // !true ^ !false > true
		System.out.println("!b1 ^ b0b0 is " + (!b1 ^ b0b0)); // !true ^ false > false
		System.out.println("b1 ^ !b0b0 is " + (b1 ^ !b0b0)); // true ^ !false > false
		System.out.println("b1 ^ b0b0 is " + (b1 ^ b0b0)); // true ^ false > true
		System.out.println("b1 | b2 is " + (b1 | b2));

		System.out.println();
		System.out.println("i3 & i4 is " + (i3 & i4));
		System.out.println("i4 | i3 is " + (i4 | i3));
		System.out.println("i4 ^ i3 is " + (i4 ^ i3));
		System.out.println("~i4 is " + ~i4);
		System.out.println("i2 << i2 is " + (i2 << i2));
		System.out.println("i >>> 1 is " + (i >>> 1));
		System.out.println("prod >> 1 is " + (prod >> 1));
		System.out.println("i2 >> i2 is " + (i2 >> i2));

		System.out.println("i(15) in binary format is " + Integer.toBinaryString(i));
		System.out.println("i2(3) in binary format is " + Integer.toBinaryString(i2));
		System.out.println("i3(10) in binary format is " + Integer.toBinaryString(i3));
		System.out.println("i4(6) in binary format is " + Integer.toBinaryString(i4));
		System.out.println("i5(0) in binary format is " + Integer.toBinaryString(i5));
		System.out.println("42 in binary format is " + Integer.toBinaryString(42));
		System.out.println("-42 in binary format is " + Integer.toBinaryString(-42));
		System.out.println("~42 in binary format is " + Integer.toBinaryString(~42));

		System.out.println(i > i2 ? i : i2);
		System.out.println(i / 2 < 4 ? 15 : 4);
		System.out.println('>' + '-');

		double d = 10.45;
		double da = d + 2; // 12.45
		double db = da - 5.45; // 7
		double dc = db * 2.5; // 17.5
		double dd = dc / 3; // 5.83
		double de = dc % 10; // 7.5
		double df = -de;

		System.out.println("d is " + d);
		System.out.println("da is " + da);
		System.out.println("db is " + db);
		System.out.println("dc is " + dc);
		System.out.println("dd is " + dd);
		System.out.println("de is " + de);
		System.out.println("df is " + df);

		int a = 1;
		int b = 2;
		int c = 3;

		a += 5;
		b *= 4;
		c += a * b;
		c %= 6;

		System.out.println("a is " + a);
		System.out.println("b is " + b);
		System.out.println("c is " + c);

		String[] Binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		int abi = 3;
		/*
		 * 0011
		 */
		int bbi = 6;
		/*
		 * 0110
		 */
		int cbi = abi | bbi;
		/*
		 * 0011 | 0110 ---- 0111 = 7
		 */
		int dbi = abi & bbi;
		/*
		 * 0011 & 0110 ---- 0010 = 2
		 */
		int ebi = abi ^ bbi;
		/*
		 * 0011 ^ 0110 ---- 0101 = 5
		 */
		int fbi = (~abi & bbi) | (abi & ~bbi);

		/*
		 * ~0011 ----- 1100
		 * 
		 * ~0110 ----- 1001
		 * 
		 * 1100 & 0110 ---- 0100 = 4
		 * 
		 * 0011 & 1001 ---- 0001 = 1
		 * 
		 * 0100 | 0001 ---- 0101 = 5
		 * 
		 */
		int gbi = ~abi & 0x0f;
		/*
		 * ~0011 ----- 1100
		 * 
		 * 1100 & 1111 ---- 1100 = 12
		 */

		System.out.println("abi = " + Binary[abi]);
		System.out.println("bbi = " + Binary[bbi]);
		System.out.println("abi | bbi = " + Binary[cbi]);
		System.out.println("abi & bbi = " + Binary[dbi]);
		System.out.println("abi ^ bbi = " + Binary[ebi]);
		System.out.println("(~abi & bbi) | (abi & ~bbi) = " + Binary[fbi]);
		System.out.println("~abi = " + Binary[gbi]);
		System.out.println();

		int hexi = 0xFFFFFFE;
		System.out.println(hexi);
		System.out.println(Integer.toBinaryString(hexi));
		for (int i1 = 0; i1 < 4; i1++) {
			hexi = hexi << 1;
			System.out.println(hexi);
		}

		System.out.println();

		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

		byte b11 = (byte) 0xf1;

		System.out.println(b11);
		System.out.println("0x0f in numeric form is " + 0x0f);
		System.out.println("0xf1 in numeric form is " + 0xf1);
		System.out.println("0x0f in binary is " + Integer.toBinaryString(0x0f));
		System.out.println("0xf1 in binary is " + Integer.toBinaryString(0xf1));
		System.out.println(Integer.toBinaryString(b11 >> 4));
		System.out.println("(b11 >> 4) & 0x0f is " + ((b11 >> 4) & 0x0f));
		System.out.println("b11 & 0x0f in numeric form is " + (b11 & 0x0f));
		System.out.println("b11 = 0x" + hex[(b11 >> 4) & 0x0f] + hex[b11 & 0x0f]);
		System.out.println();
		
		byte b12 = 0x2f;
		
		System.out.println("0x2f in numeric form is " + b12);
		System.out.println("0x2f in binary is " + Integer.toBinaryString(b12));
		System.out.println("(0x2f >> 4) in binary is " + Integer.toBinaryString(b12 >> 4));
		System.out.println("(0x2f >> 4) in numeric form is " + (0x2f >> 4));
		System.out.println("(0x2f >> 4) | 0x0f is " + Integer.toBinaryString((b12 >> 4) | 0x0f));
		System.out.println("(0x2f >> 4) | 0x0f in numeric form is " + ((0x2f >> 4) | 0x0f));
		System.out.println("b11 | 0x0f in numeric form is " + (b11 | 0x0f));
		System.out.println();
		
		byte bya = (byte) 0xf1;
		byte byb = (byte)(bya >> 4);
		byte byc = (byte)(bya >>> 4);
		byte byd = (byte)((bya & 0xff) >> 4);
		
		System.out.println("(byte) 0xf1 >> 4  = " + (bya >> 4)); // -1
		System.out.println("(byte) 0xf1 = " + bya); // -15
		System.out.println("(byte) 0xf1 in hexa = 0x" + Integer.toHexString(bya)); // 0xfffffff1
		System.out.println("0xf1 in binary  = " + Integer.toBinaryString(bya)); // 11110001
		System.out.println();
		
		System.out.println("(byte) 0xf1 in binary  = " + Integer.toBinaryString(bya)); // 11111111111111111111111111110001
		System.out.println("(byte) 0xf1 & 0x0f = " + (bya & 0x0f)); // 1
		System.out.println("(byte) (0xf1 & 0x0f) in hexa = 0x" + Integer.toHexString(bya & 0x0f)); // 0x1
		System.out.println();
		
		System.out.println("(byte) (0xf1 >> 4) in binary = " + Integer.toBinaryString(byb)); // 1111
		System.out.println("(byte) (0xf1 >> 4) in decimal = " + (byb)); // 15
		System.out.println("(byte) (0xf1 >> 4) in hexa = 0x" + Integer.toHexString(byb));
		System.out.println();
		
		System.out.println("(byte) (0xf1 >>> 4) in binary = " + Integer.toBinaryString(byc)); // 1111
		System.out.println("(byte) (0xf1 >>> 4) in decimal = " + (byc)); // 15
		System.out.println("(byte) (0xf1 >> 4) in hexa = 0x" + Integer.toHexString(byc));
		System.out.println();
		
		System.out.println("(byte) ((0xf1 & 0xff) >> 4) in binary = " + Integer.toBinaryString(byd)); // 1111
		System.out.println("(byte) ((0xf1 & 0xff) >> 4) in decimal = " + (byd)); // 15
		System.out.println("(byte) (0xf1 >> 4) in hexa = 0x" + Integer.toHexString(byd));
		System.out.println();
		
		System.out.println("bya = 0x" +hex[(bya >> 4) & 0x0f] + hex[bya & 0x0f]);
		System.out.println("bya >> 4 = 0x" +hex[(byb >> 4) & 0x0f] + hex[byb & 0x0f]);
		System.out.println("bya >>> 4 = 0x" +hex[(byc >> 4) & 0x0f] + hex[byc & 0x0f]);
		System.out.println("(bya & 0xff) >> 4 = 0x" +hex[(byd >> 4) & 0x0f] + hex[byd & 0x0f]);
		System.out.println();
		
		

	}
}
