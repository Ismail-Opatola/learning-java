package com.github.ismailopatola.learningjava.fundamentals;

public class ObjectsOOP {

	public static void main(String[] args) {
		/**
		 * Object (OOP)
		 * ------------
		 * + object is an instance of a class that may contain <i>attributes</i> and <i>methods</i>
		 * + ex. (phone, desk, computer, coffee cup)
		 */
		
		// construct an instance
		Car myCar1 = new Car("Bema");
		Car myCar2 = new Car("Lambo");
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println(myCar1.price);
		myCar1.drive();
		myCar1.brake();

		System.out.println();

		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		System.out.println(myCar2.price);
		myCar2.drive();
		myCar2.brake();
	}

}
