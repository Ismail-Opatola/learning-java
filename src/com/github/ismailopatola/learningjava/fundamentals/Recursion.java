package com.github.ismailopatola.learningjava.fundamentals;

import java.util.Scanner;

import sun.jvm.hotspot.HelloWorld;

public class Recursion {

	public static void main(String[] args) {
		/**
		 * recursion
		 * ---------
		 * + The process in which a method calls itself continuously
		 * + a method that calls itself is called recursive method
		 * + useful for factorials, transversing trees, and simplifying acomplex task
		 */
		
		Scanner scanner
		 = new Scanner(System.in);
		
		/**
		 * Ex. 1
		 */
//		System.out.println("How many times do you want to say hello?: ");
//		int number = scanner.nextInt();
//		
//		HelloWorld(number);
		
		/**
		 * Ex. 2
		 */
		System.out.println("How far do you want to walk?: ");
		int distance = scanner.nextInt();
		
		takeAStep(0, distance);
		
		scanner.close();
	}

	private static void takeAStep(int i, int distance) {
		if(i < distance) { // base case
			i++;
			System.out.println("You take a step : " + i + " meter/s");
			takeAStep(i, distance);
		} else {
			System.out.println("You're done walking! :)");
		}
	}

	static void HelloWorld(int n) {
		if(n > 0) { // base case
			System.out.println("Hello world " + n);
			n--;
			HelloWorld(n);
		}
	}
}
