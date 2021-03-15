package com.github.ismailopatola.learningjava.fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {
		/**
		 * Wrapper Classes
		 * --------------- 
		 * + provides a way to use primitive data types as reference data types
		 * + ref data types contain useful methods
		 * + ref data types can be used with collections (ex.ArrayList)
		 * 
		 * Primitive	wrapper
		 * ---------	--------
		 * boolean		Boolean
		 * char			Character
		 * int			Integer
		 * double		Double
		 * 
		 * ------------
		 * Autoboxing
		 * ------------
		 * The automatic conversion that the java compiler
		 * makes btw the primitive types and their corresponding object wrapper class
		 * ------------
		 * Unboxing
		 * ------------
		 * The reverse of autoboxing
		 * automatic conversion of wrapper class to primitive types
		 */
		
		Boolean a = true; // it will automatically autobox 
		Character b = '@';
		Integer c = 1123;
		Double d = 3.14;
		String e = "Bro";
		
		a.booleanValue(); // ex. methods available to ref data type after autoboxing
		
		if(a == true) { // automatically unbox and behave as a primitive i.e boolean
			System.out.println("This is true");
		}

	}

}
