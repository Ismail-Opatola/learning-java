package com.github.ismailopatola.learningjava.fundamentals;

public class Arrays {

	public static void main(String[] args) {

		//	arrays = used to store amultiple val in single variables
		int[] numArry = {22, 99, 5, 6, 221};
		String[] carStrings = {"Tesla", "Toyota", "Hunda", "Mercedes"};
		carStrings[0] = "ferrari";
		System.out.println(carStrings[0]);
		System.out.println(numArry);
		
		String[] carsArrayWithSize = new String[3];
		carsArrayWithSize[0] = "Camaro";
		carsArrayWithSize[1] = "Corvette";
		carsArrayWithSize[2] = "Tesla";
		System.out.println(carsArrayWithSize[2]);
		
//		iterate array
		for(int i = 0; i < carsArrayWithSize.length; i++) {
			System.out.println(carsArrayWithSize[i]);
		}
	}

}
