package com.github.ismailopatola.learningjava.fundamentals;

public class Friend {
	
	String name;
	static int numberOfFriends; // static var
	
	public Friend(String name) {
		 this.name = name;
		 numberOfFriends++;
	 }
	
	static void displayFriends() { // static method
		System.out.println("You have " + numberOfFriends + " friends");
	}
}
