package com.innovator.learnit.javacore.primitives.Loops.LoopsEXs;

import java.util.Scanner;

public class LoopsEx2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the height of the pyramid ");
		int N = in.nextInt();
		int i = 0;
		int j = i + 1;
		int z = 0;
		while (z < N * 2) {
			while (i < j && j <= N) {
				System.out.print("*");
				i++;
				if (i == j) {
					i = 0;
					break;
				}
			}
			if (z >= N - 1) {
				j--;
			} else {
				j++;
			}
			System.out.println();
			z++;
		}
	}
}
