package com.github.ismailopatola.learningjava.fundamentals;

public class ArrayOfObjects {

	public static void main(String[] args) {
		/**
		 * OOP - Array of objects
		 * ----------------------
		 * 
		 */
		
		// standard array
		int[] num = new int[3]; // array of int
		char[] characters = new char[4]; // array of char
		String[] strings = new String[5]; // array of stings
		
		// declare array of object
		// 1.
		Food[] refrigrator = new Food[3];

		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
		refrigrator[0] = food1;
		refrigrator[1] = food2;
		refrigrator[2] = food3;
		
		// 2.
		Food[] freezer = {food1, food2, food3};
		
		System.out.println(refrigrator[0].name);
		System.out.println(refrigrator[1].name);
		System.out.println(refrigrator[2].name);
		System.out.println(freezer[0].name);
	}

}
