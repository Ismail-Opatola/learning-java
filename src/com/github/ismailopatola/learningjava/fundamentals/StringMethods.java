package com.github.ismailopatola.learningjava.fundamentals;

public class StringMethods {

	public static void main(String[] args) {
		// String = a ref data type that can store one or more characters
		// ref data types have access to useful methods
		
		String name = "Bro";
		
		boolean result = name.equalsIgnoreCase("bro"); // not case sensitive
		boolean match = name.equals("Bro"); // case sensitive
		int resultLength = name.length();
//		char result1stChar = name.charAt(0);
		int index = name.indexOf("o");
		boolean isEmpty = name.isEmpty(); // " " = false
		boolean isBlank = name.isBlank(); // " " = true
		String upperString = name.toUpperCase();		
		String lowerString = name.toLowerCase();
		String trimString = name.trim();
		
		System.out.println(isBlank);

	}

}
