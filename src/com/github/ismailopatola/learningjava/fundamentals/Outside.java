package com.github.ismailopatola.learningjava.fundamentals;

public class Outside {
	
	String xString = "Hello ";

	public class Inside {
		
		String yString = "world";
		
		public void greeting() {
			System.out.println(xString + yString);
		}
	}
}
