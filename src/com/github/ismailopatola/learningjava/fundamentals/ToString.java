package com.github.ismailopatola.learningjava.fundamentals;

public class ToString {

	public static void main(String[] args) {
		/**
		 * toString method
		 * ---------------
		 * implicitly called when we use the println statement
		 */
		
		Car car = new Car();
		
		System.out.println(car); // ex. print address of obj but we've override toString in Car constructor to print the cars instead
		System.out.println(car.toString()); // ex. print address of obj but we've override toString in Car constructor  to print the cars instead

	}

}
