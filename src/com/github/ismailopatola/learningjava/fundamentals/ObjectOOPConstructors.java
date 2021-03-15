package com.github.ismailopatola.learningjava.fundamentals;

public class ObjectOOPConstructors {

	public static void main(String[] args) {
		/**
		 * Object OOP Constructor
		 * ----------------------
		 * allow us to asign different attributes to each objs that we instantiate
		 */
		
		Human rick = new Human("Rick", 65, 70);
		Human sharon = new Human("Sharon", 45, 38);
		
		System.out.println(rick.name);
		System.out.println(sharon.name);
		
		sharon.eat();
		rick.drink();
		

	}

}
