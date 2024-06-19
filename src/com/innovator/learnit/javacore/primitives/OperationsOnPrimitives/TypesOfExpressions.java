package com.innovator.learnit.javacore.primitives.OperationsOnPrimitives;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TypesOfExpressions {
	public static void main(String[] args) {
		byte b = 2;
		short s = 2;
		int i = 3;
		long l = 4;

		float f = 1;
		double d = 2;

		char c = 'A';

		int intTypeExpression = b + b;  // type variable-name = expression; --------> statement
		int intTypeExpression2 = s * b;
		int intTypeExpression3 = i / b;

		long longTypeExpression = i * (s + b);
		
		float floatTypeExpression = f % b;
		
		double doubleTypeExpression = d * c / l;
		
		System.out.println(intTypeExpression);
		System.out.println(intTypeExpression2);
		System.out.println(intTypeExpression3);
		System.out.println(longTypeExpression);
		System.out.println(floatTypeExpression);
		System.out.println(doubleTypeExpression);
		
		double d2 = 10.0/3.0;
		
		BigDecimal bd = BigDecimal.valueOf(d2).setScale(2, RoundingMode.HALF_UP);
		
		System.out.println(bd);
		System.out.println();

		//String builders
		System.out.println("Hello " + 1);
		System.out.println("Hello " + null);
	}
}
