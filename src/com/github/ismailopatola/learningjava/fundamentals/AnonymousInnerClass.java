package com.github.ismailopatola.learningjava.fundamentals;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		/**
		 * anonymous inner classes
		 * -----------------------
		 * an inner class without a name
		 * only a single object is created from one
		 * The object may have "extras" or "changes"
		 * and no need to create a separate innerclass
		 * when it only need it once.
		 * Helps us to avoid cluttering code with a Class name
		 * 
		 * Syntax is similar to a constructor.
		 * except that there is also a class definition
		 * within a block of code.
		 * GREAT FOR LISTENERS
		 */

		// Ex. 1

		Greeting greeting = new Greeting() {
			@Override
			public void Welcome() {
				System.out.println("Yo bro");
			}
		};
		
		greeting.Welcome();
		
		Greeting greeting2 = new Greeting();
		greeting2.Welcome();
		
		// Ex. 2
		
		MyFrame15 myFrame =  new MyFrame15();

	}

}
