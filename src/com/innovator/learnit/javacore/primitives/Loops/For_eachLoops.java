package com.innovator.learnit.javacore.primitives.Loops;

public class For_eachLoops {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int sum = 0;
		for(int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Summation of numbers: " + sum);

		/*
		 * for each loop is created for cycling over a collection of elements such as arrays
		 * from start to finish.
		 * I can't change the direction of iteration in for each loop.
		 * for each loop is called enhanced for loop.
		 * 
		 * In for each loop, we don't have to declare a counter and put increments or decrements.
		 * in the for each parenthesis, we have the iteration variable number of type int.
		 * The iteration variable receives an element from the array at a time, on each iteration of the loop,
		 * element from the array will be assigned to the variable and inside the loop body.
		 * 
		 * The loop will stop when the last element of the array is retrieved from the array.
		 */
		
		String[] lovelyname = {"H","e","d","r","a"};
		System.out.println("Lovely name is ");
		for(String letter : lovelyname) {
			System.out.print(letter);
		}
		System.out.println();
		
		String lovelyName = "Hedra";
		char[] letters = lovelyName.toCharArray(); //TO BE WRITTEN IN THE STRING CLASS!
		//Converts this string to a new character array.
		System.out.println(letters);
		for(char letter : letters) {
			System.out.println(letter);
		}
		int sum2 = 0;
		for(int i : arr){
			sum2 += i;
		}
		System.out.println(sum2);
		
		for (int x : arr) {
			System.out.println(x);
			x = 10;
		}
	}

}
