package com.github.ismailopatola.learningjava.fundamentals;

import java.util.Scanner;

/**
 * @author Ismail
 *
 */
public class WhileLoops {

	public static void main(String[] args) {
		// executes a block of code as long as it's condition remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		name = handleDoWhileLoop(name, scanner);

		 System.out.println("Hello "+ name);
		 scanner.close();
	}
	
	public static String handleDoWhileLoop(String name, Scanner scanner) {
		// will	run once and check condition afterwards	
		do {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		} while (name.isBlank());
		return name;
	}
	
	public static String handleWhileLoop(String name, Scanner scanner) {
		// run until condition is false 
		while (name.isBlank()) {
			System.out.println("Enter your name: ");
			name = scanner.nextLine();
		}
		return name;
	}

}
