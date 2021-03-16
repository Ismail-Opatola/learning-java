package com.github.ismailopatola.learningjava.fundamentals;

public class ObjectPassing {

	public static void main(String[] args) {
		/**
		 * Pass Object as argument
		 */
		
		Garage garage = new Garage();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		garage.park(car1);
		garage.park(car2);
		
	}

}
