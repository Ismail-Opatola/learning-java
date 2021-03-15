package com.github.ismailopatola.learningjava.fundamentals;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		/**
		 * ArrayList
		 * ---------
		 * + a resizable array.
		 * + elements can be added and removed after compilation phase
		 * + stores ref data types
		 */
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza"); // add or insert
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi"); // update @ index
		food.add(1, "suasage"); // insert @ index
//		food.remove(2); // delete @ index
//		food.clear(); // clear
		
//		System.out.println(food);

		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
