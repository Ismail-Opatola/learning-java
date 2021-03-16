package com.github.ismailopatola.learningjava.fundamentals;

public class Abstractions {

	public static void main(String[] args) {
		/**
		 * Abstract - modifier
		 * -------------
		 * abstract classes cannot be instantiated, 
		 * but they can have a subclass
		 * abstraction methods are declared without an implemetation
		 * 
		 * adds layer of security to your program
		 */
		
		// Vehicle2 vehicle = new Vehicle2(); // can't instantiate an abstract class
		Car3 car = new Car3();
		car.go();
	}

}
