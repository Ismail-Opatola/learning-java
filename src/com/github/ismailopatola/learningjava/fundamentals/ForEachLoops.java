package com.github.ismailopatola.learningjava.fundamentals;

import java.util.ArrayList;

public class ForEachLoops {

	public static void main(String[] args) {
		/**
		 * for-each
		 * --------
		 * + traversing technique to iterate the elements in an array/collection
		 * + less steps, more readable
		 * + less flexible
		 */
		
		String[] animals = {"dog", "cat", "rat", "bird"};
		ArrayList<String> animailsList = new ArrayList<String>();
		
		animailsList.add("dog");
		animailsList.add("cat");
		animailsList.add("rat");
		animailsList.add("bird");
		
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(String i: animailsList) {
			System.out.println(i);
		}

	}

}
