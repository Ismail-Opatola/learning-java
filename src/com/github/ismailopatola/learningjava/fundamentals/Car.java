package com.github.ismailopatola.learningjava.fundamentals;

public class Car {
	String make = "Chevrolet";
	String model = "Corvette";
	int year = 2021;
	String color = "blue";
	double price = 500000.00;
	
	String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	void drive () {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You step on the brake");
	}
	
	public String toString () {
		return make + "\n" + model + "\n" + color  + "\n" + year;
	}
}
