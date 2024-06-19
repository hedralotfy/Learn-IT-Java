package com.innovator.learnit.javacore.methods.Exercises;

import java.util.Scanner;

public class Ex5_RotateMatrix {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter matrix size: ");
		int size = in.nextInt();

		double[][] matrix = new double[size][size];

		System.out.println("How you want to rotate your matrix?\n"
		+ "\tPress 1 - 90\n"
		+ "\tPress 2 - 180\n"
		+ "\tPress 3 - 270");
		int choice = in.nextInt();

		System.out.println(System.lineSeparator() + "Basic Matrix:" + System.lineSeparator());
		makeOriginal(matrix);
		printMatrix(matrix);
		System.out.println();

		switch (choice) {
		case 1:
			System.out.println("Matrix rotated by 90 degrees" + System.lineSeparator());
			rotateBy90(matrix, size);
			printMatrix(matrix);
			break;
		case 2:
			System.out.println("Matrix rotated by 180 degrees" + System.lineSeparator());
			rotateBy180(matrix, size);
			printMatrix(matrix);
			break;
		case 3:
			System.out.println("Matrix rotated by 270 degrees" + System.lineSeparator());
			rotateBy270(matrix, size);
			printMatrix(matrix);
			break;
		default:
			System.out.println("You haven't selected a correct choice.");
		}

	}

	public static double[][] makeOriginal(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + "." + Integer.toString(j));
			}
		}
		return matrix;
	}

	// Method for transposing matrix

	public static double[][] transpose(double[][] matrix, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				double temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		return matrix;
	}

	public static double[][] reverseVertically(double[][] matrix, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size / 2; j++) {
				double temp = matrix[i][size - j - 1];
				matrix[i][size - j - 1] = matrix[i][j];
				matrix[i][j] = temp;
			}
		}
		return matrix;
	}

	public static double[][] reverseHorizontally(double[][] matrix, int size) {
		for (int i = 0; i < size / 2; i++) {
			for (int j = 0; j < size; j++) {
				double temp = matrix[i][j];
				matrix[i][j] = matrix[size - i - 1][j];
				matrix[size - i - 1][j] = temp;
			}
		}
		return matrix;
	}
	// Method for rotating by 90

	public static double[][] rotateBy90(double[][] matrix, int size) {
		transpose(matrix, size);
		reverseVertically(matrix, size);

		return matrix;
	}

	// Method for rotating by 180
	public static double[][] rotateBy180(double[][] matrix, int size) {
		transpose(matrix, size);
		reverseHorizontally(matrix, size);
		reverseVertically(matrix, size);
		return matrix;
	}

	// Method for rotating by 270
	public static double[][] rotateBy270(double[][] matrix, int size) {
		transpose(matrix, size);
		reverseHorizontally(matrix, size);
		return matrix;
	}

	// Method for printing the matrix
	public static void printMatrix(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
