package com.innovator.learnit.javacore.primitives.OperationsOnPrimitives;

import java.util.Scanner;
import java.lang.Math;

public class Ex3_CircleCircumference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		double r = in.nextDouble();
		double CC = 2*Math.PI*r;

		System.out.println("Circle circumference is: " + CC);
	}

}
