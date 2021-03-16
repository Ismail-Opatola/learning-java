package com.github.ismailopatola.learningjava.fundamentals;

public class StaticKeyword {

	public static void main(String[] args) {
		/**
		 * static - <i>modifier</i>
		 * -------
		 * only one copy of a variable/method is created and shared.
		 * The class "owns" the static member
		 * any other obj that inherit this class share the single copy of the var
		 * 
		 * ex. both friend1, friend2 are sharing the same numberOfFriends beacause
		 * there is only one copy.
		 */
		
		Friend friend1 = new Friend("Tayo");
		Friend friend2 = new Friend("Toye");
		Friend friend3 = new Friend("Rakiya");
		
		System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
	}

}
