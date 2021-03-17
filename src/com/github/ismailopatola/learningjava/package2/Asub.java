package com.github.ismailopatola.learningjava.package2;

import com.github.ismailopatola.learningjava.package1.*;

public class Asub extends A{
	public static void main(String[] args) {
		
		/*
		 *  c.defaultMessage is visible, it's within the same package - package2.
		 *  as it's a default access modifier within the C class in package2
		 *  and can only be accessed within package2
		 */
		C c = new C();
		System.out.println(c.defaultMessage); 
		
		/** 
		 *  A.protectedMessage
		 *  visible to a different class in a different package 
		 *  as long as that class is a subclass of A
		 */
		Asub asub = new Asub();
		System.out.println(asub.protectedMessage); 

		
	}
	
}
