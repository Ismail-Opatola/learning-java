package com.github.ismailopatola.learningjava.fundamentals;

public class Variables {

	public static void main(String[] args) {
		
		int x; // declaration
		x = 123; // assignment
		int o = 19; // initialization

		long g = 1234567893637828273L;
		byte f = 100;
		float y = 3.14f;
		double v = 3.14; // has precision
		boolean z = false;
		char symbol = '@';
		
		String name = "Bro"; 
		
		System.out.println("number: " + x);
		System.out.println("character: " + symbol);
		System.out.printf("String: %s \n\n", name);
		System.out.println("integer: " + o);
		System.out.println("long: " + g);
		System.out.println("byte: " + f);
		System.out.println("float: " + y);
		System.out.println("double: " + v);
		System.out.println("boolean: " + z + "\n");

		variablesSwap();
	}
	
	/**
	 * <i>Example: swap two variables</i>
	 */
	public static void variablesSwap() {
		String water = "water";
		String koolAid = "Kool-Aid";
		String temp;
		
		temp = water;
		water = koolAid;
		koolAid = temp;
		
		System.out.println("water: " + water);
		System.out.println("koolAid: " + koolAid);
	}

}
