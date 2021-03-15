package com.github.ismailopatola.learningjava.fundamentals;
import java.util.Scanner;
public class MathClass {

	public static void main(String[] args) {

		double x = 3.14;
		double y = -10;
		
		double max = Math.max(x, y),
			   absoluteVal = Math.abs(y),
			   squareRoot = Math.sqrt(absoluteVal),
			   round = Math.round(squareRoot),
			   ceiling = Math.ceil(squareRoot),
			   floor = Math.floor(squareRoot);

		System.out.println(max);
		System.out.println(absoluteVal);
		System.out.println(squareRoot);
		System.out.println(round);
		System.out.println(ceiling);
		System.out.println(floor);
		
		Hypotenuse();
	}
	
	/**
	 * <i>Find the hypotenuse of a triangle</i>
	 */
	public static void Hypotenuse (){
		
		double x,y,z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
		scanner.close();
	}

}
