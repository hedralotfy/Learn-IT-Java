package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;

public class Ex11_Roma2DeciAndViseVersa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Choose a mode between Roman2Decimal or Decimal2Roman:" + System.lineSeparator()
				+ "For Roman2Decimal, type R2D" + System.lineSeparator() + "For Decimal2Roman, type D2R");
		String choice = in.next();
		
		while(!choice.matches("^[Dd]2[Rr]")&&!choice.matches("^[Rr]2[Dd]")){
			System.out.print("Enter a value among D2R or R2D ");
			choice = in.next();
		}
		
		switch (choice) {
		case "R2D":
		case "r2d":	
			System.out.println("Enter a roman number: ");
			String romanNumber = in.next();

			while (isRomanNumberValid(romanNumber) == false) {
				System.out.print("Enter a valid Roman number, please ");
				romanNumber = in.next();
			}

			System.out.println("Decimal value is: " + roman2Decimal(romanNumber));
			break;
		default:
			System.out.println("Enter a decimal number: ");
			int decimal = in.nextInt();
			while (isDecimalNumberValid(decimal) == false) {
				System.out.print("Enter a valid integer from 1 to 100, please ");
				decimal = in.nextInt();
			}
			System.out.println("Roman value is: " + decimal2Roman(decimal));
			break;
		}
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

	public static int roman2Decimal(String romanNumber) {
		String[] romanNumberArr = romanNumber.split("");
		int decimalNumber = 0;
		int numberLength = romanNumberArr.length;
		int j = numberLength - 1;
		int k = j;
		firstloop: for (int i = numberLength - 1; i >= 0; i--) {
			for (; j >= 0; j--) {
				if (romanNumberArr[i].equalsIgnoreCase("C")) {
					if (i == j) {
						decimalNumber += 100;
					}
					if (romanNumberArr[j].equalsIgnoreCase("X")) {
						decimalNumber -= 10;
					}
				} else if (romanNumberArr[i].equalsIgnoreCase("L")) {
					if (i == j) {
						decimalNumber += 50;
					}
					if (romanNumberArr[j].equalsIgnoreCase("X")) {
						decimalNumber -= 10;
					}
				} else if (romanNumberArr[i].equalsIgnoreCase("X")) {
					if (i == j) {
						decimalNumber = 10;
						continue;
					}
					if (romanNumberArr[i].equalsIgnoreCase(romanNumberArr[j])) {
						decimalNumber += 10;
					} else if (romanNumberArr[j].equalsIgnoreCase("L")) {
						decimalNumber += 50;
					} else {
						decimalNumber -= 1;
					}
					j--;
					continue firstloop;

				} else if (romanNumberArr[i].equalsIgnoreCase("V")) {
					if (i == j) {
						decimalNumber = 5;
						continue;
					}
					if (romanNumberArr[j].equalsIgnoreCase("C")) {
						decimalNumber += 100;
					} else if (romanNumberArr[j].equalsIgnoreCase("L")) {
						decimalNumber += 50;
					} else if (romanNumberArr[j].equalsIgnoreCase("X")) {
						decimalNumber += 10;
					} else {
						decimalNumber -= 1;
					}
					j--;
					continue firstloop;
				} else {
					if (i == j) {
						decimalNumber = 1;
						continue;
					}
					if (romanNumberArr[j].equalsIgnoreCase("C")) {
						decimalNumber += 100;
					} else if (romanNumberArr[j].equalsIgnoreCase("L")) {
						decimalNumber += 50;
					} else if (romanNumberArr[j].equalsIgnoreCase("X")) {
						decimalNumber += 10;
					} else if (romanNumberArr[j].equalsIgnoreCase("V")) {
						decimalNumber += 5;
					} else {
						decimalNumber += 1;
					}
					j--;
					continue firstloop;
				}
				if (j == 0) {
					break firstloop;
				}
			}
		}
		return decimalNumber;
	}

	public static boolean isRomanNumberValid(String romanNumber) {

		String iRegex = "^[Ii]([Ii]{1,2}|[VvXx])?";

		String vRegex = "^[Vv]([Ii]{1,3})?";

		String xRegex = "^[Xx]([CcLl]([Ii][VvXx]|[Ii]{1,3}|[Vv]([Ii]{1,3})?)?|[Vv]([Ii]{1,3})?"
				+ "|[Ii][VvXx]|[Ii]{1,3}|[Xx]{1,2}([Ii][VvXx]|[Ii]{1,3}|[Vv]([Ii]{1,3})?)?)?";

		String lRegex = "^[Ll]([Vv]([Ii]{1,3})?|[Ii][VvXx]|[Ii]{1,3}|[Xx]{1,3}([Ii][VvXx]|[Ii]{1,3}"
				+ "|[Vv]([Ii]{1,3})?)?)?";

		String cRegex = "^[Cc]";

		boolean isMatching = false;
		if (romanNumber.matches(iRegex)) {
			isMatching = true;
		} else if (romanNumber.matches(vRegex)) {
			isMatching = true;
		} else if (romanNumber.matches(xRegex)) {
			isMatching = true;
		} else if (romanNumber.matches(lRegex)) {
			isMatching = true;
		} else if (romanNumber.matches(cRegex)) {
			isMatching = true;
		}
		return isMatching;
	}

	public static boolean isDecimalNumberValid(int decimalNumber) {
		boolean isValid = false;
		if (decimalNumber >= 1 && decimalNumber <= 100) {
			isValid = true;
		}
		return isValid;
	}

}
