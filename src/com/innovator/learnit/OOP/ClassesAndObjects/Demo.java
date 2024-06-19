package com.innovator.learnit.OOP.ClassesAndObjects;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("========= DEFAULT CONSTRUCTOR DEMO =========");
		
		Cart cart = new Cart();
		
		System.out.println(cart);
		
		System.out.println();
		System.out.println("========= CUSTOM CONSTRUCTOR DEMO =========");
		
		//Like this we're calling the custom constructor and
		//passing the constructor arguments.
		//id and userId of this class object are different from those
		//of the first one.
		Cart cart2 = new Cart(2, 2);
		
		System.out.println(cart2);

		System.out.println();
		//Demo2 is going to be like that of the 
		System.out.println("========= DEFAULT CONSTRUCTOR DEMO2 =========");
		
		//Like this we're calling the custom constructor and
		//passing the constructor arguments.
		//id and userId of this class object are different from those
		// of the first one.
		//We didn't call the constructor with the parameters, so we got the id=0, userId=1
		// just like the default constructor.
		Cart cart3 = new Cart();
		
		System.out.println(cart3);
	}

}
