package com.github.ismailopatola.learningjava.fundamentals;

public class Hero extends Person {
 
  String power;
 
  Hero(String name, int age, String power) {
	super(name,age); // pass args to parent class - Person constructor
	this.power = power;
  }
  
  public String toString () {
	return super.toString() + "\n" + this.power; 
	// access parent class method
  }
}
