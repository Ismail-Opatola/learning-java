package com.github.ismailopatola.learningjava.fundamentals;

public class MethodChaining {

	public static void main(String[] args) {
		/**
		 * mehod chaining 
		 * --------------
		 * a common syntax for invoking multiple method calls in OOP
		 * condence code into less lines
		 */
		
		String name = " bro";
		
//		name = name.concat(" code");
//		name = name.toUpperCase();
//		name = name.trim()
				
		name = name.concat(" code").toUpperCase().trim(); // method chaining

		System.out.println(name);
	}

}
