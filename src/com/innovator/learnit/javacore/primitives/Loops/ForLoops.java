package com.innovator.learnit.javacore.primitives.Loops;

public class ForLoops {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("Counter " + i);
		}
		/*
		 * int i = 0; (initialization) will be executed once; I will be initialized to
		 * be = 0. Then condition will be verified. condition verification takes place
		 * before each iteration, if condition is true, loop body is executed. then
		 * comes the increment or decrement, which is executed after each iteration.
		 * When i reaches 5, loop body will be skipped.
		 */

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("Counters: i = " + i + ", j = " + j);
		}
		/*
		 * Here, we can initialize 2 variables using comma, at each iteration one
		 * counter will be incremented, but the other will be decremented. Also, we can
		 * increment both the variables after each iteration.
		 */
		
		
//		  for(;;){
//			  System.out.println("Fierce");
//		  }
//		 

		int num;
		boolean isPrime;
		num = 14;
		if (num < 2)
			isPrime = false;
		else
			isPrime = true;
		for (int i = 2; i <= num / i; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		int a,b;
		
		for(a=1,b = 4; a<b; a++,b--) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
		System.out.println();
		
		boolean done = false;
		int i=1;
		for(; !done;) {
			System.out.println("i = " + i);
			if(i==10)
				done = true;
			i++;
		}
		
		/*
		 * In the previous code block, we started by initializing the done variable of type boolean
		 * to false.
		 * And the i to be = 1
		 * 
		 * In the for(; !done;) loop parenthesis, we negated the value of variable done, so now it evaluates to
		 * true, now the return value will let the body of the loop be executed.
		 * 
		 * In the for(; !done;) loop body: 
		 * 1-The value of i(1) will be printed.
		 * 2-in the condition in if(i==10) parenthesis we will check the equality of i to 10.
		 * 3-If condition (i==10) will evaluate to false, which will result in skipping the if(i==10) body.
		 * 4-i will be incremented by 1.
		 * 
		 * The loop will keep executing, i will keep increasing by 1, till it reaches 10, when
		 * it reaches 10, value of i(10) will be printed, condition in if(i==10) becomes true,
		 * value of done will become true.
		 * When condition of the for(; !done;) is checked, the value of done(true) will be negated,
		 * so false will be returned, as the condition of for(; !done;) loop becomes false,
		 * the body will be skipped.
		 */
	}

}
