package com.github.ismailopatola.learningjava.fundamentals;

//public class MyGenericClass <Thing>{

// Ex. 4
//public class MyGenericClass <Thing1, Thing2>{

// Ex. 5 bouded types
public class MyGenericClass <Thing1 extends Number, Thing2>{

	Thing1 x;
	Thing2 y;
	
	public MyGenericClass(Thing1 x, Thing2 y) {
		this.x = x;  
		this.y = y;  
		
	}
	
//	public Thing1 getValue() {
//		return x;
//	}
	
	public Thing2 getValue() {
		return y;
	}
}
