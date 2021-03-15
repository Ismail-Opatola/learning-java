package com.github.ismailopatola.learningjava.fundamentals;

public class SwitchStatement {

	public static void main(String[] args) {
		String day = "Tuesday";
		
		switch(day) {
			case"Sunday": 
				System.out.println("It's Sunday");
			break;
			case "Monday": 
				System.out.println("It's Monday");
			break;
			case "Tuesday": 
				System.out.println("It's Tuesday");
			break;
			default: 
				System.out.println("That is not a day!");
			break;
		}
		
		// call another class in same package
		MathClass.Hypotenuse();
	}

}
