package com.github.ismailopatola.learningjava.fundamentals;

public class Arrays2D {

	public static void main(String[] args) {
//		2d array = array of arrays
		String[][] carStrings = {
			{"Camero","Corvette","silverado"},
			{"Mustang","Ranger","F-150"},
			{"Ferrari","Lambo","Tesla"}
		};
	    
//		String[][] carStrings = new String[3][3];
//		carStrings[0][0] = "Camero";			
//	    carStrings[0][1] = "Corvette";
//	    carStrings[0][2] = "silverado";
//	    carStrings[1][0] = "Mustang";
//	    carStrings[1][1] = "Ranger";
//	    carStrings[1][2] = "F-150";
//	    carStrings[2][0] = "Ferrari";
//	    carStrings[2][1] = "Lambo";
//	    carStrings[2][2] = "Tesla";
	    
	    
	    for(int i = 0; i < carStrings.length; i ++ ) {
	    	System.out.println();
	    	for (int j = 0; j < carStrings[i].length; j++) {
				System.out.print(carStrings[i][j]+ " ");;
			}
	    }
	}

}
