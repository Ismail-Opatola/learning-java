package com.github.ismailopatola.learningjava.fundamentals;

public class Enums {
	
	enum Planet {
		MECURY(1, "I'm mecury"),
		VENUS(2, "I'm venus"),
		EARTH(3, "I'm earth"),
		MARS(4, "I'm mars"),
		JUPITER(5, "I'm jupiter"),
		SATURN(6, "I'm saturn"),
		URANUS(7, "I'm uranus"),
		NEPTUNE(8, "I'm neptune"),
		PLUTO(9, "I'm pluto");
		
		int number;
		String details;
		
		private Planet(int number, String details) {
			this.number = number;
			this.details = details;
		}
	}

	public static void main(String[] args) {
		/**
		 * enum
		 * ----
		 * enumerated 
		 * (ordered listing of items in a collection)
		 * + enums are constant and can not be changed
		 * + they behave similarly to objects
		 * + A grouping of constants that behave similarly to objects
		 */

		Planet myPlanet = Planet.EARTH;
		canILiveHere(myPlanet);
	}
	
	static void canILiveHere(Planet myPlanet) {
		switch (myPlanet) {
		case EARTH: 
			System.out.println("You can live here :)");
			System.out.println("This is planet #" + myPlanet.number);
			System.out.println("Hello world, " + myPlanet.details);
		break;
		default:
			System.out.println("You can't live here....yet");
		}
	}

}
