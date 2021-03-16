package com.github.ismailopatola.learningjava.fundamentals;

public class Car3 extends Vehicle2 {
	
	@Override void go() { 
		// we're force to implement the abstract method specified in Vehicle2 
		System.out.println("Moving");
	}

}
