package com.innovator.learnit.javacore.primitives.ControlStatements;

public class If_elseConstruction {

	public static void main(String[] args) {
		int CashInAcc = 100;
		int ItemPrice = 200;

		if (CashInAcc > ItemPrice) {
			System.out.println("Item is purchased.");
		} else {
			System.out.println("You can't purchase this item because you're broke.");
		}

		CashInAcc = 300;
		if (CashInAcc > ItemPrice)
			System.out.println("Now, you're rich, item is purchased.");
		else
			System.out.println("You can't purchase this item because you're broke.");

		int i1 = 10;
		int i2 = 20;
		int i3 = 30;

		if (i1 > i2) {
			if (i2 > i3) {
				System.out.println("i1 is the greatest and i2 is > i3");
			} else {
				System.out.println("i1 is the greatest and i3 is > i2");
			}
		} else {
			if (i1 > i2) {
				System.out.println("i3 is the greatest and i1 is > i2");
			} else {
				System.out.println("i3 is the greatest and i2 is > i1");
			}
		}
	}
}
