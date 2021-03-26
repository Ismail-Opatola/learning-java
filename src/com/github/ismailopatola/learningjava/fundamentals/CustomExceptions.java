package com.github.ismailopatola.learningjava.fundamentals;

import java.util.Scanner;

public class CustomExceptions {

	public static void main(String[] args) {
		/**
		 * Exception
		 * ---------
		 * An event, after execution, that disrupts the normal flow of the program
		 * Ex. ArithmeticException, ArrayIndexOutOfBoundException, FileNotFoudException
		 * 
		 * User defined exception
		 * ----------------------
		 * custom exceptions
		 * Ex. DuplicateEmail, InvalidCreditException, AgeException
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		try {
			checkAge(age);
		} catch (Exception e) {
			System.out.println("A problem occured: " + e);
		}
		
		scanner.close();
	}

	private static void checkAge(int age) throws AgeException {
		
		if(age < 18) {
			throw new AgeException("\n" + "You must be 18+ to sign up");
		} else {
			System.out.println("You're now signed up");
		}
	}

}
