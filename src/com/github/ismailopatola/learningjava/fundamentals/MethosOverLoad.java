package com.github.ismailopatola.learningjava.fundamentals;

public class MethosOverLoad {

	public static void main(String[] args) {
		/**
		 * Overload Methods
		 * ----------------
		 * + methods that share the same name but
		 * have different parameters
		 * + method name + parameters = method signature
		 */
		
		int x = add(1, 2);
		int z = add(1, 2, 8);
		int w = add(1, 2, 8, 6);
		double v = add(1.0, 3.0, 2.0); 
		
		System.out.println(x);
		System.out.println(z);
		System.out.println(w);
		System.out.println(v);
		
	}
	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}

}
