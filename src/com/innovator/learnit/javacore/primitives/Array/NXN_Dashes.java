package com.innovator.learnit.javacore.primitives.Array;

public class NXN_Dashes {
	public static void main(String[] args) {
		char[][] NXN_Dashes = new char[10][10];
		int i,j;
		for(i=0; i<10; i++){
			for(j=0; j<10; j++){
				NXN_Dashes[i][j]='-';
				//printing each element of the array.
				System.out.print(NXN_Dashes[i][j] + " ");
			}
			//Moving to the next line to represent a new row.
			System.out.println();
		}
	}
}
