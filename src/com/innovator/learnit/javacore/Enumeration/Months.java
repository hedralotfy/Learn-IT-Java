package com.innovator.learnit.javacore.Enumeration;

public enum Months {
	JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31),
	AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

	private int daysAmount;

	//The constructor is similar in structure to JANUARY(31), FEBRUARY(28), ...
	//Constructor call is similar to method call, we call constructor and pass value to it.
	//For JANUARY(31), we pass 31 to the constructor.
	//daysAmount is initialized with 31.
	private Months(int daysAmount) {
		this.daysAmount = daysAmount;
		
		//this keyword means that for THIS enum, which is JANUARY in our case, daysAmount variable will be 31.
	}

	public int getDaysAmount() {
		return this.daysAmount;
	}
}
