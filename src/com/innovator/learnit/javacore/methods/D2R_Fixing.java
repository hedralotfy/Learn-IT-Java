package com.innovator.learnit.javacore.methods;

import java.util.Scanner;

public class D2R_Fixing {

	public static String romanValue = "";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a decimal number: ");
		int decimal = in.nextInt();
		System.out.println("Roman value is: " + decimal2Roman(decimal));

	}

	public static String decimal2Roman(int number) {
		String romanNumber = "";
		if (number < 5 || number >= 5 && number <= 10) {
			romanNumber += ItoX(number);
		} else if (number > 10 && number <= 50) {
			romanNumber += XItoL(number);
		} else {
			romanNumber += LItoC(number);
		}
		return romanNumber;
	}

	public static String ItoV(int number) {
		
		String romanNumber = "";

		if (number < 5 && number != (5 - 1)) {
			for (int i = 0; i < number; i++) {
				romanNumber += "I";
			}
		} else if (number == (5 - 1)) {
			romanNumber += "IV";
		} else {
			romanNumber += "V";
		}
		return romanNumber;
	}

	public static String VItoX(int number) {
		String romanNumber = "";
		if (number > 5 && number <= 10) {
			if (number < 10 && number != (10 - 1)) {
				romanNumber += "V";
				for (int i = 5; i < number; i++) {
					romanNumber += "I";
				}
			} else if (number == (10 - 1)) {
				romanNumber += "IX";
			} else {
				romanNumber += "X";
			}
		}

		return romanNumber;
	}

	public static String XItoL(int number) {
		String romanNumber = "";
		int unitDigit = number % 10;
		number -= unitDigit;
		if (number < 40) {

			for (int i = 10; i <= number; i += 10) {
				romanNumber += "X";
			}

			romanNumber += ItoX(unitDigit);

		}

		else if (number >= 40 && number < 50) {
			romanNumber += "XL";
			romanNumber += ItoX(unitDigit);
		}

		else if (number == 50) {
			romanNumber += "L";
		}
		return romanNumber;
	}

	public static String LItoC(int number) {
		String romanNumber = "";
		int unitDigit = number % 10;
		number -= unitDigit;
		if (number < 60) {
			
			romanNumber += "L";
			romanNumber += ItoX(unitDigit);
		} 
		
		else if (number >= 60 && number < 90) {
			romanNumber += "L";
			for (int i = 50; i < number; i += 10) {
				romanNumber += "X"; // 15-4-2024
			}
			romanNumber += ItoX(unitDigit);
		}

		else if (number >= 90 && number < 100) {
			romanNumber += "XC";
			if (unitDigit != 0) {
				romanNumber += ItoX(unitDigit);
			}
		} else {
			romanNumber = "C";
		}
		return romanNumber;
	}

	public static String ItoX(int number) {
		String romanNumber = "";
		if (number != 0) {
			if (number <= 5) {
				romanNumber += ItoV(number);
			} else {
				romanNumber += VItoX(number);
			}
		}
		return romanNumber;
	}
//	
//	Wrong conversions
//	public static String ItoV(int number) {
//
//		if (number < 5 && number != (5 - 1)) {
//			for (int i = 0; i < number; i++) {
//				romanValue += "I";
//			}
//		} else if (number == (5 - 1)) {
//			romanValue += "IV";
//		} else {
//			romanValue += "V";
//		}
//		return romanValue;
//	}
//
//	public static String VItoX(int number) {
//		if (number > 5 && number <= 10) {
//			if (number < 10 && number != (10 - 1)) {
//				romanValue += "V";
//				for (int i = 5; i < number; i++) {
//					romanValue += "I";
//				}
//			} else if (number == (10 - 1)) {
//				romanValue += "IX";
//			} else {
//				romanValue += "X";
//			}
//		}
//
//		return romanValue;
//	}
//
//	public static String XItoL(int number) {
//		int unitDigit = number % 10;
////		number -= unitDigit;
//		if (number < 40) {
//			for (int i = 10; i <= number; i += 10) {
//				romanValue += "X";
//			}
//
////				romanValue += ItoX(number);
//			romanValue += ItoX(unitDigit);
//
//		}
//
//		if (number >= 40 && number < 50) {
//			romanValue += "XL";
//			romanValue += ItoX(unitDigit);
//		}
//
//		if (number == 50) {
//			romanValue += "L";
//		}
//		return romanValue;
//	}
//
//	public static String LItoC(int number) {
//		int unitDigit = number % 10;
//		number -= unitDigit;
//		if (number < 60) {
//			romanValue += "L";
//			romanValue += ItoX(unitDigit);
//		}
//		if (number >= 60 && number < 90) {
//			romanValue += "L";
//			for (int i = 10; i < number; i += 10) {
//				romanValue += "X"; // 15-4-2024
//			}
//			romanValue += ItoX(unitDigit);
//		}
//
//		if (number >= 90 && number < 100) {
//			romanValue = "XC";
//			if (unitDigit != 0) {
//				romanValue += ItoX(unitDigit);
//			}
//		} else {
//			romanValue = "C";
//		}
//		return romanValue;
//	}
//
//	public static String ItoX(int number) {
//		if (number != 0) {
//			if (number <= 5) {
//				ItoV(number);
//			} else {
//				VItoX(number);
//			}
//		}
//		return romanValue;
//	}
}
