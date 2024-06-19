package com.innovator.learnit.javacore.primitives.OperationsOnPrimitives;

import java.util.Scanner;
import java.lang.Math;

public class Ex2_TriangleArea {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		double A = in.nextDouble();
		
		System.out.print("Please, enter B side of a triangle: ");
		double B = in.nextDouble();
		
		System.out.print("Please, enter C side of a triangle: ");
		double C = in.nextDouble();
		
		/**
		 * We will need perimeter to of triangle, we will add the three sides.
		 * Then we will divide them by 2 to get the variable that will be used in the
		 *  area's calculation formula, let's store the result of adding the sides
		 *  and dividing them by 2 in a variable s of type double. 
		 */
		double s = (A + B + C) / 2;
		
		/**
		 * Now area is calculated by a formula called heron's formula, here it is:
		 * Math.sqrt(s*(s-A)*(s-B)*(s-C))
		 * and we will store it in a variable called Area of type double.
		 * after that we will print the value of Area in a message.
		 * Note: if the value of the root square was negative, NaN will be printed.
		 */
		double Area = Math.sqrt(s*(s-A)*(s-B)*(s-C));
		System.out.println("Area of the triangle is " + Area);

	}

}
