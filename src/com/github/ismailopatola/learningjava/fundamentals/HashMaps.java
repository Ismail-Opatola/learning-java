package com.github.ismailopatola.learningjava.fundamentals;

import java.util.HashMap;
import java.util.Iterator;

public class HashMaps {

	public static void main(String[] args) {
		/**
		 * HashMap
		 * -------
		 * + HashMap implements the Map interface (need import)
		 * + its similar to ArrayList, but with key-value pairs
		 * + stores objects, need to use Wrapper Class
		 * Ex.
		 * (name,email),(username,userID),(country,capital)
		 * 
		 */
		
		HashMap<String, String> countries = new HashMap<>();
//		HashMap<String, Integer> countries = new HashMap<>();
//		HashMap<String, Double> countries = new HashMap<>();
		

		// add akey and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Dehli");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		
//		System.out.println(countries);
//		countries.remove("USA");
//		System.out.println(countries.size());
//		countries.replace("USA", "Detroit);
//		System.out.println(countries.get("USA"));
//		countries.clear();
//		System.out.println(countries.containsKey("England"));
//		System.out.println(countries.containsValue("Beijing"));
		
		// loop keys
		for (String i : countries.keySet()) {
			System.out.print(i + "\t" + "= ");
			System.out.println(countries.get(i)); // get value of key i
		}
		
		// loop values
		for (String i : countries.values()) {
			System.out.println((i)); // print value
		}
	}

}
