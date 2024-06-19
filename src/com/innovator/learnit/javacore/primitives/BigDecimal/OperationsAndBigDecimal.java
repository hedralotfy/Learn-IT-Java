package com.innovator.learnit.javacore.primitives.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsAndBigDecimal {
	public static void main(String[] args) {
		int i = 20;
		System.out.println(i / 3);
		System.out.println(i - (6 * 3));
		System.out.println((double)i / 3);
		
		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
		BigDecimal amountOfPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
		
		System.out.println(rideFee);
		System.out.println(amountOfPeople);
		System.out.println(chargePerPerson);
		
		double d1 = 3.71;
		double d2 = 1.11;
		BigDecimal bd1 = BigDecimal.valueOf(d1).setScale(2);
		BigDecimal bd2 = BigDecimal.valueOf(d2).setScale(2);
		System.out.println(bd1.subtract(bd2));
		System.out.println();
		
		BigDecimal bd3 = BigDecimal.valueOf(3.41).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(2.123).setScale(3);
		BigDecimal bdm = bd3.divide(bd4, RoundingMode.HALF_UP);
		System.out.println(bdm);
		System.out.println();
		
		BigDecimal BD = BigDecimal.valueOf(5.434);
		BigDecimal BD2 = BigDecimal.valueOf(5.044);
		BigDecimal BDResult = BD.add(BD2).setScale(2, RoundingMode.HALF_UP);
		BigDecimal BDResult2 = BD.add(BD2).setScale(2, RoundingMode.HALF_DOWN);
		BigDecimal BDResult3 = BD.add(BD2).setScale(1, RoundingMode.HALF_UP);
		System.out.println(BDResult);
		System.out.println(BDResult2);
		System.out.println(BDResult3);
		System.out.println();
		
		int Comp = BD.compareTo(BD2); //If the value resulting from the function was 1, that means first parameter is bigger than 2nd, will be -1 if it was
		// less than the 2nd, 0 if they were equal.
		
		System.out.println(Comp);
		
		BigDecimal bd5 = new BigDecimal(341.345);
		BigDecimal bd6 = new BigDecimal(32.234);
		bd5 = bd5.add(bd6);
		System.out.println("BigDecimal 5: " + bd5);
		
		bd5 = bd5.subtract(bd6);
		System.out.println("BigDecimal 5 now: " + bd5);
		
		bd5 = bd5.multiply(bd6);
		System.out.println("BigDecimal 5 now: " + bd5);
		
		bd5 = bd5.divide(bd6);
		System.out.println("BigDecimal 5 now: " + bd5);
		
		bd5 = bd5.multiply(bd6);
		System.out.println("BigDecimal 5 now: " + bd5);
		
		bd5 = bd6.pow(2);
		System.out.println("BigDecimal 5 now: " + bd5);
		
		bd5 = bd5.negate();
		System.out.println("BigDecimal 5 now: " + bd5);
		
		BigDecimal A, B;
		
		A = BigDecimal.valueOf(10.54);
		B = BigDecimal.valueOf(5.4);
		
		A = BigDecimal.ZERO;
		System.out.println(A);
		System.out.println();
		
		BigDecimal C;
		C = A.add(B);
		System.out.println("BigDecimal C = " + C);
		System.out.println();
		
		BigDecimal D;
		String str = "1234567.7654321";
		D = A.add(new BigDecimal(str));
		System.out.println("BigDecimal D is " + D);
		System.out.println();
		
		double val = 123.321;
		C = B.add(BigDecimal.valueOf(val));
		System.out.println(C);
		System.out.println();
		
		val = C.doubleValue();
		System.out.println("double val = " + val);
		
		str = D.toString();
		System.out.println("String str = " + str);

		int a = A.compareTo(C);
		System.out.println("int a = " + a);
		System.out.println();
		
		int b = B.compareTo(A);
		System.out.println("int b = " + b);
		System.out.println();
		
		int c = A.compareTo(A);
		System.out.println("int c = " + c);
		System.out.println();
		
		
		boolean bool = A.equals(C);
		System.out.println("boolean bool = " + bool);
	}

}
