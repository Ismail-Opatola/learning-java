package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.event.ItemEvent;
import java.util.HashMap;
import java.util.Iterator;

public class Generics {

	public static void main(String[] args) {
		/**
		 * generics
		 * --------
		 * enable types (classes and interfaces) to be parameters when defining: 
		 * classes, interfaces and methods
		 * 
		 * a benefint is to eliminate the need to create multiple versions
		 * of methods or classes for various data types.
		 * 
		 * use 1 version for all reference data types
		 * 
		 */
		
//		Integer[] intArray = {1,2,3,4,5};
//		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
//		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//		String[] stringArray = {"B", "Y", "E"};
		
//		Ex. 1 (generic method)
//		displayArray(intArray);
//		displayArray(doubleArray);
//		displayArray(charArray);
//		displayArray(stringArray);
		
//		Ex. 2 (generic method)
//		System.out.println(getFirst(intArray));
//		System.out.println(getFirst(doubleArray));
//		System.out.println(getFirst(charArray));
//		System.out.println(getFirst(stringArray));
		
//		Ex. 3 (generic method)
		// game sprites
//		Player player = new Player();
//		Enemy enemy = new Enemy();
//		Item item = new Item();
//		Tree tree = new Tree();
//		
//		draw(player);
//		draw(enemy);
//		draw(item);
//		draw(tree);
		
//		Ex. 4  (generic classes)
//		MyIntegerClass myInt = new MyIntegerClass(1);
//		MyDoubleClass myDouble = new MyDoubleClass(3.14);
//		MyCharacterClass myChar = new MyCharacterClass('@');
//		MyStringClass myString = new MyStringClass("Hello");
//		
//		System.out.println(myInt.getValue());
//		System.out.println(myDouble.getValue());
//		System.out.println(myChar.getValue());
//		System.out.println(myString.getValue());
//
//		MyGenericClass<Integer, Integer> myInt2 = new MyGenericClass<>(1, 9);
//		MyGenericClass<Double, Double> myDouble2 = new MyGenericClass<>(3.14, 1.01);
//		MyGenericClass<Character, Character> myChar2 = new MyGenericClass<>('@', '#');
//		MyGenericClass<String, Character> myString2 = new MyGenericClass<>("Hello", '!');
//		
//		// above similar using to HasMap
//		HashMap<Integer, String> usersHashMaps = new HashMap();
//		
//		System.out.println(myInt2.getValue());
//		System.out.println(myDouble2.getValue());
//		System.out.println(myChar2.getValue());
//		System.out.println(myString2.getValue());
		
//		Ex. 5 (Bounded Types)
		// you can create the objects of a generic class to have data
		// of specific derived types ex. Number
		
//		MyGenericClass<Integer, Integer> myInt2 = new MyGenericClass<>(1, 9);
//		MyGenericClass<Double, Double> myDouble2 = new MyGenericClass<>(3.14, 1.01);
		
		
		
	}
	
//	public static void displayArray(Integer[] array) {
//		for (Integer x : array) {
//			System.out.print(x + " ");
//		}
//	}
//	public static void displayArray(Double[] array) {
//		for (Double x : array) {
//			System.out.print(x + " ");
//		}
//	}
//	public static void displayArray(Character[] array) {
//		for (Character x : array) {
//			System.out.print(x + " ");
//		}
//	}
//	public static void displayArray(String[] array) {
//		for (String x : array) {
//			System.out.print(x + " ");
//		}
//	}
	
//	 Using Generic
//	public static <T> void displayArray(T[] array) {
//		for (T x : array) {
//			System.out.print(x + " ");
//		}
//	}
//	
//	public static <Thing> Thing getFirst(Thing[] array) {
//		return array[0];
//	}

// 	EX. 3
//	public static <Thing> void draw(Thing[] x) {
//		x.draw();
//	}

// 	EX. 4 
	
}
