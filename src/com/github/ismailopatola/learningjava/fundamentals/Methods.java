package com.github.ismailopatola.learningjava.fundamentals;

public class Methods {

	public static void main(String[] args) {
		/**
		 * methods
		 * -------
		 * a block of code that is executed whenever it's called upon
		 */
		
		String name = "Bro";
		int age = 28, x = 3, y = 4;
		
		System.out.println(add(x, y));
		
		hello(name, age);
		hello(name, age);
		hello(name, age);

	}
	
	static void hello(String name, int age) {
		System.out.printf("Hello %s \n", name);
		System.out.printf("You're %d years old \n", age );
	}
	
	static int add(int a, int b) {
		return a+b;
	}

}
