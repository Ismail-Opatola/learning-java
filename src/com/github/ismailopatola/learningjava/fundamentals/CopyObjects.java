package com.github.ismailopatola.learningjava.fundamentals;

public class CopyObjects {

	public static void main(String[] args) {
		/**
		 * Copy objects in java
		 * --------------------
		 * 
		 */
		
		Car4 car1 = new Car4("Chevy", "Camero", 2021);
		Car4 car2 = new Car4("Ford", "Mustang", 2022);
		
		// to copy
		// wrong, passes car1 pointer to car2
		// therefore pointing to the same car in memory
//		car2 = car1; 
		// solution
		// create a copy method in Car4
		car2.copy(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
		
		// Ex.2 using a constructor
		// method Overloading
		
		Car4 car3 = new Car4(car1);
		System.out.println();
		System.out.println(car3);
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());

	}

}
