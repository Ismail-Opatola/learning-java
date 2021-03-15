package com.github.ismailopatola.learningjava.fundamentals;

import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rows, columns;
		String symbolString = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use: ");
		symbolString = scanner.next();
		
		for (int i = 1; i <= rows ; i++) {
			System.out.println();
			for (int j = 1; j <= columns ; j++) {
				System.out.print(symbolString);
			}	
		}
		scanner.close();
	}

}
