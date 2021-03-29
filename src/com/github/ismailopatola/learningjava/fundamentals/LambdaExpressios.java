package com.github.ismailopatola.learningjava.fundamentals;

public class LambdaExpressios {

	public static void main(String[] args) {
		/**
		 * lanbda expression
		 * -----------------
		 * feature for java 8 and above
		 * also known as an <i>anonymous method</i>
		 * a shorter way to write anonymous classes with only one method
		 * 
		 * need to use a functional interface or use a pre-defined functional interface
		 * they contain only one abstract method
		 * Ex. ActionListener, Runnable, (user-defined)
		 * 
		 * A Lambda expression can be used in any place where a functional interface wouold be required
		 * How to use a lambda expression:
		 * (arg) -> {statement/s}
		 */
		
//		// Ex. 1
//		String name = "Ismail";
//		char symbol = '!';
////		MyInterface myInterface = () -> System.out.println("Hello World!"); // single expression
//		MyInterface myInterface = (x, symb) -> {
//			// multiple expression
//			System.out.println("Hello " + x);
//			System.out.println("It's a nice day, no?" + symb);
//		};
//		myInterface.message(name, symbol);
//		
//		// Ex. 2
//		MyInterface myInterface2 = (x, symb) -> {
//			// multiple expression
//			System.out.println("Hello " + x + symb);
//			System.out.println("It's a nice day, no?" + symb);
//		};
//		myInterface2.message(name, symbol);
		
		// Ex. 3
		MyFrame16 frame = new MyFrame16();
		
	}

}
