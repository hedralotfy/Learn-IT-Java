package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;

public class Ex2_DrawingEmptyRectangle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter height of rectangle: ");

		int h = in.nextInt();

		System.out.print("Enter width of rectangle: ");
		int w = in.nextInt();
		
		drawRectangle(h, w);

	}
	
	/*
	 * At the website I just shifted the i
	 * from i = height to i = height-1.
	 * from int j = 1; to int j = 0;
	 * from j==width to j==width-1
	 * from i==height to i==height-1
	 * from j = 1; to j = 0;
	 */
	public static void drawRectangle(int rectHeight, int rectWidth){
		int i = rectHeight;
		int j = 1;
		String str;
		while(rectHeight>0 && rectWidth>0 && i>=j){
			while(j<=rectWidth){
				str = ((j==1||j==rectWidth||i==1||i==rectHeight)? "*":" ");
				System.out.print(str);
				j++;
			}
			System.out.println();
			j = 1;
			i--;
		}
	}

}
