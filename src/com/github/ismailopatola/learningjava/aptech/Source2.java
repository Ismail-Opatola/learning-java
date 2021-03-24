package com.github.ismailopatola.learningjava.aptech;

import java.util.Scanner;

// // Class name should be "Source",
// // otherwise solution won't be accepted

public class Source2{
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
           
            // Declare the variable
            int a, b, c, d;
           
            // Read the variable from STDIN
            System.out.print(" ");
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            d = (b * b) - 4 * a * c;

            if (d > 0.0) {
                double r1 = ((-b + Math.sqrt(d)) / (2 * a));
                double r2 = ((-b - Math.sqrt(d)) / (2 * a));
                 // Output the variable to STDOUT
                System.out.println("Roots are real numbers");
                System.out.printf("Roots of quadratic equation are: %.3f %.3f", r1, r2);
               
            } else if (d == 0.0) {
                double r = (-b / (2 * a));
                 // Output the variable to STDOUT
                System.out.println("Both roots are equal.");
                System.out.printf("Root of quadratic equation is: %.3f", r);
               
            } else {
                //executes if d < 0
                 // Output the variable to STDOUT
                System.out.println("Roots are complex numbers");
            }
            input.close();
        }
    }
}

