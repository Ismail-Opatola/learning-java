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
	
	
//	/**
//	 *  Branchless Programming
//	 */
//	
//	static int Smaller(int a, int b) { // branching
//		if(a<b)
//			return a;
//		else 
//			return b;
//	}
//	
//	static int Smaller_Branchless(int a, int b) {
//		return a*(a<b) + b*(b<=a);
//		//	arrithmetic condition: (a<b) return 1 if true, 0 if false
//		//  ex. a*1 + b*0 = a
//		
//		/**
//		 * a*(condition for a)+
//		 *  b*(condition for b)+
//		 *  c*(condition for c)+
//		 *  ...
//		 */
//	}
//	
	

}
