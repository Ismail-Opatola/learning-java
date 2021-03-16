package com.github.ismailopatola.learningjava.fundamentals;

public class Inheritence {

	public static void main(String[] args) {
		/**
		 * Inheritence
		 * -----------
		 * the process where one class acquires,
		 * the attributes and methods of another.
		 * 
		 * SuperClass
		 * 	-> SubClass
		 * 	-> SubClass
		 * 	-> SubClass
		 */
		
		Car2 car = new Car2();
		car.go();
		
		Bicycle bike = new Bicycle();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println(car.doors); // unique to the Car2 class
		System.out.println(bike.pedals); // unique to Bicycle class

	}
}
