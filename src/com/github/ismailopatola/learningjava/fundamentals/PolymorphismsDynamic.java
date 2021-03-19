package com.github.ismailopatola.learningjava.fundamentals;

import java.util.Scanner;

public class PolymorphismsDynamic {

	public static void main(String[] args) {
		/**
		 * Dynamic Polymorphism
		 * --------------------
		 * 
		 * polymorphism = many shapes/forms
		 * dynamic = after compilation (during runtime)
		 * 
		 * Ex. a Corvette is a: Corvette, and a Car, and a Vehicle, and an Object
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		Animal2 animal;
	
		System.out.println("What animal do yo want?");
		System.out.println("(1=dog) or (2=cat)");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog2();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal2();
			System.out.println("That choice was invalid");
			animal.speak();
		}
		
		scanner.close();
	}

}
