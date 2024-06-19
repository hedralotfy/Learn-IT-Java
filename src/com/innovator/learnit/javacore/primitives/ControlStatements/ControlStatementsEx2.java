package com.innovator.learnit.javacore.primitives.ControlStatements;

public class ControlStatementsEx2 {

	public static void main(String[] args) {
		
//		var val1 = 1.0f;
//		int val2 = 2;
////		Object[] values = {val1, val2};
////		boolean checkval1 = Object.getClass();
//		String var1= ((Object)args[0]).getClass().getSimpleName();
//		String var2= ((Object)args[1]).getClass().getSimpleName();
//		System.out.println("value of var1 is: " + var1 + "\n while var2 is: " + var2);
//		
//		if(var1!=var2) {
//			float sum = val1 + val2;
//			sum = (float)sum;
//			System.out.println(sum);
//		}else {
//			float sum = val1 + val2;
//			sum = (int)sum;
//			System.out.println(sum);
//		}
		args[0]="1.2";
		args[1]="3";
		var value1 = Integer.valueOf(args[1]);
		var value2 = Float.valueOf(args[0]);
		var sum = value1 + value2;
		if(((Object)value1).getClass().getSimpleName()==(((Object)value2).getClass().getSimpleName())){
			int NewSum = (int)sum;
			System.out.println(NewSum);
		} else {
			float newSum = (float)sum;
			System.out.println(newSum);
			}
		
	}

}
