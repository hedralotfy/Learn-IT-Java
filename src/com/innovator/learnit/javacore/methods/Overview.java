package com.innovator.learnit.javacore.methods;

public class Overview {

	public static void main(String[] args) {
		/*
		 * Method is a block of code which is referred to by a name
		 * and can be called at any point in my program, simply with
		 * its name.
		 * 
		 * A method is a chunk of a request that can be performed on
		 * the request.
		 * 
		 * During the execution of the program, when a method call is
		 * performed, the program proceeds execution from that method,
		 * and when method is finished, execution returns to the line
		 * of code from where method was called.
		 * 
		 * Each method has access modifier, if we declared a method as
		 * private, the method can be only accessed in its scope of
		 * class.
		 * 
		 * When writing Static in the syntax of the method, it means
		 * that this method is not connected to the instances of this
		 * class but with the class itself.
		 * 
		 * A method has a return type, then its name is next to its parameters.
		 * Method names are usually verbs, started with lower case letters and
		 * written in camel case, Example:
		 * public static void printToConsole() {}
		 * 
		 * here is a sample syntax:
		 * private static int sum(parameters) {method body of summation}
		 * 
		 * In methods with return type other than void 
		 * to return a value of the method body, we use {@code return;}
		 * and specify either variable name or expression which has
		 * compatible type with return type specified in method declaration.
		 * 
		 * The result of the execution of the method can be assigned to
		 * a variable of the same type as the return type.
		 * 
		 * It's very important to name the method similar to what it does.
		 * 
		 * Method's name and parameters together is called method signature.
		 * 
		 * Why access modifier or return type is not part of the method signature?
		 * The reason for this is method overloading and it's the ability to write
		 * the method that have the same name but accept different parameters.
		 * 
		 * The Java compiler has the ability to discern (recognize) the difference between
		 * the methods through the method signatures.
		 */
		
		/*
		 * We can call the method sum which returns value.
		 * We can initialize the int variable sum with the
		 * value which was returned from this method.
		 * The same with method sum which returns a double value.
		 * and then initialize the double variable dum with
		 * the value which was returned from this method.
		 */
		int sum = sum(1, 3);
		double dum = sum(1.2, 2.5);
		
		/*
		 * I can call a method and pass to it the result of execution of another
		 * method as arguments, this means that the method in the argument
		 * will be executed first.
		 */
		printToConsole(sum);
		printToConsole(sum(1.3, 5.2));
		printToConsole(dum);
		printToConsole("Sicktum");
		
		/*
		 * In this method parameters, we declare that this method works with 2
		 * integers and int values can be passed as arguments to this method.
		 */
		

	}
	private static int sum(int i1, int i2) {
		int result = i1 + i2;
		return result;
	}
	
	private static double sum(double d1, double d2) {
		return d1 + d2;
	}
	
	/*
	 * Both methods had the same name sum, the first one sums two
	 * arguments, the first method can sum 2 integers but the second
	 * can sum 2 doubles.
	 * Like that we can say that the method sum is overloaded,
	 * because we have 2 methods with the same name but with different
	 * signatures.
	 */
	
	private static void printToConsole(int i) {
		System.out.println(i);
	}
	
	private static void printToConsole(double d) {
		System.out.println(d);
	}
	
	private static void printToConsole(String s) {
		System.out.println(s);
	}
	
	/*
	 * also printToConsole is an overloaded method, as
	 * it works with different data types, int and double and String.
	 */

}
