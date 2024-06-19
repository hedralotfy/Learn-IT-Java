package com.innovator.learnit.javacore.primitives.Array;

public class ThreeDArrays {

	public static void main(String[] args) {
		int[][][] threeDArray = new int[3][4][5];
		int i, j, k;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 5; k++) {
					threeDArray[i][j][k] = i * j * k;
					System.out.print(threeDArray[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
