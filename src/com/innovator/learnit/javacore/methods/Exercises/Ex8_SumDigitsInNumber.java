package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;

public class Ex8_SumDigitsInNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int N = in.nextInt();

		
		int sum = sumDigitsInNumber(N);
		System.out.println("Sum of digits in the number is " + sum);
	}
	
	public static int sumDigitsInNumber(int number) {
		int sum = 0;
		for(int divisor = 1; Math.abs(number) >= divisor; divisor*=10){
			sum += number/divisor % 10;
		}
		return Math.abs(sum);
	}

	public static int sumDigitsInNumber2(int number) {
		int result = 0;
		while (number != 0) {
			result += number % 10;
			number /= 10;
		}
		return Math.abs(result);
	}
	
}
