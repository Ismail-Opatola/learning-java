package com.github.ismailopatola.learningjava.fundamentals;

import java.io.Serializable;

public class User implements Serializable {

	// declare serialVersionUID
	// ------------------------
	private static final long serialVersionUID = 1;
	
	String nameString;
//	String passwordString;
	
	// transient values
	// ----------------
	transient String passwordString; // will be ignored and not serialized 
	
	public void sayHello() {
		System.out.println("Hello " + nameString);

	}
}
