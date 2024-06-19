package com.innovator.learnit.javacore.primitives.Array;

import java.util.Arrays;

public class Multidimentional_Arrays {

	public static void main(String[] args) {
		int TwoD[][] = new int[4][5];

		int i, j, k = 0;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				TwoD[i][j] = k;
				System.out.print(TwoD[i][j] + " ");
				k++;
			}
			System.out.println();
		}
		System.out.println();
		int twoD[][] = new int[4][];
		twoD[0] = new int[5];
		twoD[1] = new int[5];
		twoD[2] = new int[5];
		twoD[3] = new int[5];

		int i2, j2, k2 = 0;
		for (i2 = 0; i2 < 4; i2++) {
			for (j2 = 0; j2 < 5; j2++) {
				twoD[i2][j2] = k2;
				System.out.print(twoD[i2][j2] + " ");
				k2++;
			}
			System.out.println();
		}

		int twoDagain[][] = new int[4][];
		twoDagain[0] = new int[1];
		twoDagain[1] = new int[2];
		twoDagain[2] = new int[3];
		twoDagain[3] = new int[4];

		System.out.println();

		int i3, j3, k3 = 0;
		for (i3 = 0; i3 < 4; i3++) {
			for (j3 = 0; j3 < i3 + 1; j3++) {
				twoDagain[i3][j3] = k3;
				System.out.print(twoDagain[i3][j3] + " ");
				k3++;
			}
			System.out.println();
		}
		
		System.out.println();

		double prod[][] = { { 0 * 0, 0 * 1, 0 * 2 }, { 1 * 0, 1 * 1, 1 * 2 }, { 2 * 0, 2 * 1, 2 * 2 } };

		int i4, j4;
		for (i4 = 0; i4 < 3; i4++) {
			for (j4 = 0; j4 < 3; j4++) {
				Arrays.toString(prod);
				System.out.print(prod[i4][j4] + " ");
			}
			System.out.println();
		}

	}

}
