package com.github.ismailopatola.learningjava.fundamentals;

import java.util.*;

public class ArrayLists2D {

	public static void main(String[] args) {
		/**
		 * 2D ArrayList
		 * ------------
		 * + a dynamic list of lists
		 * + you can change the size of these lists during runtime
		 */
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> productList = new ArrayList<String>();
		productList.add("tomatoes");
		productList.add("zucchini");
		productList.add("peppers");

		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("soda");
		drinkList.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(productList);
		groceryList.add(drinkList);
		
		System.out.println(groceryList.get(0)); // 1st index
		System.out.println(groceryList.get(0).get(0)); // 1st index of bakeryList
		System.out.println(groceryList.get(2).get(1)); // 2nd index of drinkList
	}

}
