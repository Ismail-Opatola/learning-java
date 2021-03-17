package com.github.ismailopatola.learningjava.package1;

import com.github.ismailopatola.learningjava.package2.*;

public class A {
	protected String protectedMessage = "This is protected"; // visible to a different class in a different package as long as that class is a subclass of C

	public static void main(String[] args) {
		
		C c = new C();
		
		/**
		 * public modifier
		 * c.publicMessage is public
		 * i.e visible to any package within the project folder
		 */
		System.out.println(c.publicMessage); 
	
		/*
		 *  error, c.defaultMessage is not visible to package1 
		 *  as it's a default access modifier within the C class in package2
		 *  and can only be accessed within package2
		 */
		// System.out.println(c.defaultMessage); 

		/**
		 * private modifier
		 * error, B.privateMessage is not visible to class A
		 * it's only accessible within class B
		 */
		// B b = new B();
		// System.out.println(b.privateMessage);
	}

}
