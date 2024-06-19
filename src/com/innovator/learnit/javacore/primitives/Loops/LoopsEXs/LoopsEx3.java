package com.innovator.learnit.javacore.primitives.Loops.LoopsEXs;

public class LoopsEx3 {

	public static void main(String[] args) {
		int[][] matric = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		for(int i = 0; i<matric.length; i++) {
			/*
			 * We are going to compare j with the length of the first dimension which is the elements in
			 * the second dimension.
			 */
			for(int j = 0; j<matric[i].length; j++) {
				System.out.print(matric[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
