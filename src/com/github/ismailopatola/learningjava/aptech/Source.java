package com.github.ismailopatola.learningjava.aptech;

import java.util.Scanner;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Declare the variable
        double a, b, c;
        double root1, root2;
		
        // Read the variable from STDIN
        System.out.println("Enter 3 numbers a, b, c: ");
        
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        double d = b * b - 4 * a * c;

        // Output the variable to STDOUT
        if(d < 0){
            root1 = -b / (2 * a);
            root2 = Math.sqrt(-d) / (2 * a);
            
            System.out.println("Roots are complex numbers");
            System.out.printf("Roots of quadratic equation are: %.3f %.3f",root1,root2);
            
        }
        else if(d > 0){
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            
            System.out.println("Roots are real numbers");
            System.out.printf("Roots of quadratic equation are: %.3f %.3f",root1,root2);
        }
        else if(d == 0){
            root1 = root2 = -b / (2 * a);
            
            System.out.println("Roots are equal numbers");
            System.out.printf("Roots of quadratic equation are: %.3f %.3f",root1,root2);
        }
        
        in.close();
        
   }
}
