package com.github.ismailopatola.learningjava.package2;

import com.github.ismailopatola.learningjava.package1.*;

public class C {
	public String publicMessage = "This is public"; // visible to any package within the project folder
	protected String protectedMessage = "This is protected"; // visible to a different class in a different package as long as that class is a subclass of C
	String defaultMessage = "This is the default"; // default access modifier
	private String privateMessage = "This is the private"; // private access modifier - only accessible within the class
}
