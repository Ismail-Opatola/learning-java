package com.github.ismailopatola.learningjava.fundamentals;

public class Polymorphisms {

	public static void main(String[] args) {
		/**
		 * Polymorphism in java
		 * --------------------
		 * + Greek word for poly - "many", morph = "form"
		 * + The ability of an object to identify as more than on type
		 */

		Car5 car = new Car5();
		Bicycle2 bicycle = new Bicycle2();
		Boat boat = new Boat();
		
		/*
		 * type = Vehicle3[]
		 * because elements in array - racers, identifies as Vehicle3 object
		 * thanks to polymorphism
		 * + The ability of an object to identify as more than on type
		 * ex. car isdentifies as type Car5 and Vehicle3
		 *     bicycle isdentifies as type Bicycle2 and Vehicle3
		 *     boat isdentifies as type Boat and Vehicle3
		 *     
		 * i.e racers identifies as Vehicle[]
		 * 
		 */
		
		Vehicle3[] racers  = {car, bicycle, boat};
		
		// for-each
		for (Vehicle3 vehicle3 : racers) {
			vehicle3.go();
		}
		
		
	}

}
