package com.github.ismailopatola.learningjava.fundamentals;

/**
 * implement muitiple interfaces
 * @author Ismail
 *
 */
public class Fish implements Prey, Preditor{

	@Override
	public void flee() {
		System.out.println("The Fish is fleeing from a larger fish");
	}
	
	@Override
	public void hunt() {
		System.out.println("The Fish is hunting smaller fish");
	}
}
