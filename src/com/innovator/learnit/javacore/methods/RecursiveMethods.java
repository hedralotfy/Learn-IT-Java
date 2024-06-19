package com.innovator.learnit.javacore.methods;

public class RecursiveMethods {

	public static void main(String[] args) {
		
//		callSameMethod(); // it will cause StackOverFlow error.
		System.out.println("5! = " + getFactorial(5));
		System.out.println("3! = " + iterateForFactorial(3));
		System.out.println("iterateForFactorial(4) = " + iterateForFactorial(4));
		System.out.println("iterateFürFacto(4) = " + iterateFürFacto(4));

	}
	
//	private static void callSameMethod() {
//		callSameMethod();
//	}
	
	private static int getFactorial(int i) {
		if(i>0) {
			return i * getFactorial(i-1);
		} else {
			return 1;
		}
	}
	
	private static int iterateForFactorial(int n){
		int factorial = 1;
		if(n==0) {
			return -1;
		}
		for(int i = 1; i<=n; i++) {
			 factorial*=i;
		}
		return factorial;
	}
	
	/*
	 * to calculate a factorial of a number we should
	 * multiply the number by the number less than it
	 * and multiply the result by the number less number
	 * and so on till we multiply the result by 1.
	 * 
	 * Let there be a variable of type int and let
	 * it be called n.
	 * 
	 * We will need a variable for iteration, which is i,
	 *  starting from 1 till it reaches the factorial number.
	 * And another variable called factorial starting from 1
	 * and as long as i is less than or equal to n,
	 * we will store the value of factorial multiplied by i
	 * till we reach n.
	 * 
	 * We should check if n was equal to 0, we will not
	 * calculate the factorial.
	 */
	private static int iterateFürFacto(int n) {
		if (n==0) {
			return -1;
		}
		
		int factorial = 1;
		
		for(int i = 1; i<=n; i++) {
			factorial*=i;
		}
		return factorial;
	}

}
