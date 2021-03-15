package com.github.ismailopatola.learningjava.fundamentals;

public class ObjectOOPConstructorsOverLoad {

	public static void main(String[] args) {
		/**
		 * Overloaded constructors
		 * -----------------------
		 * + multiple constructors within a class with the same name,
		 * + but have different parameters
		 * + name + param = signature
		 */
		Pizza emptyPizza = new Pizza();
		Pizza onlyBreadPizza = new Pizza("thick crust");
		Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");
		
		System.out.println(pizza.bread);
		
	}

}
