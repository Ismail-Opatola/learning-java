package com.github.ismailopatola.learningjava.fundamentals;

public class Encapsulations {

	public static void main(String[] args) {
		/**
		 * Encapsulation
		 * -------------
		 * attributes of a class will be hidden or private,
		 * can be accessed only through methods (getters & setters)
		 * you should make attributes private if you don't have a reason to make them public
		 * 
		 */
		
		Car4 car4 = new Car4("Chevy", "Camero",  2021);
		
		System.out.println(car4.getMake());
		System.out.println(car4.getModel());
		System.out.println(car4.getYear());
		
		car4.setYear(2020);
		System.out.println(car4.getYear());
		

	}

}
