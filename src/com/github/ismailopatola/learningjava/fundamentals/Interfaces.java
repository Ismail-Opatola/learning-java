package com.github.ismailopatola.learningjava.fundamentals;

public class Interfaces {

	public static void main(String[] args) {
		/**
		 * Interface in Java
		 * ------------------
		 * + a template that can be applied to a class.
		 * + similar to inheritance, but specifies what a class has/must do.
		 * + classes can apply more thana one interface, inheritance is limited to 1 super class
		 */

		Rabbit rabbit  = new Rabbit();
		
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		
		hawk.hunt();
		
		Fish fish = new Fish();
		
		fish.hunt();
		
		fish.flee();
	}

}
