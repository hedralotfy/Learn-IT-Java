package com.innovator.learnit.javacore.Enumeration;

public class EnumDemo {

	public static void main(String[] args) {
		Priority priority = Priority.HIGH;

		switch (priority) {
		case HIGH:
			System.out.println("High priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low priority");
			break;
		}
		
		System.out.println(System.lineSeparator() + "============Enum valueOf() method" + System.lineSeparator());
		
		Priority priority2 = Priority.valueOf("HIGH");
		
//		priority2 = Priority.valueOf("high");	//java.lang.IllegalArgumentException
		
		System.out.println("Priority.HIGH == Priority.MEDIUM: " + (priority2 == Priority.MEDIUM)); //false
		
		System.out.println("Priority.HIGH == Priority.HIGH: " + (priority2 == Priority.HIGH)); //true
		
		//In those comparisons, we ere using ordinals.
		
		System.out.println(System.lineSeparator() + "============Enum ordinal() method" + System.lineSeparator());
		//We will be using priority.value.ordinal()
		
		System.out.println("Priority.HIGH.ordinal() = " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.ordinal() = " + Priority.MEDIUM.ordinal());
		System.out.println("Priority.LOW.ordinal() = " + Priority.LOW.ordinal());
		
		System.out.println(System.lineSeparator() + "============Enum iteration" + System.lineSeparator());
		
		Priority[] values = Priority.values();
		for(Priority priority3 : values) {
			System.out.println(priority3);
		}
		
		System.out.println(System.lineSeparator() + "============Enum fields and methods" + System.lineSeparator());
		
		System.out.println("Months.JANUARY.getDaysAmount(): " + Months.JANUARY.getDaysAmount());
		
	}

}
