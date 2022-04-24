package com.bridgelabz;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b and c to find roots of  a*x*x + b*x + c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int delta = (b*b)-(4*a*c);
        double root1 = (-b + sqrt(delta))/(2*a);
        double root2 = (-b - sqrt(delta))/(2*a);

        System.out.println("Root 1 of x: "+root1);
        System.out.println("Root 2 of x: "+root2);
    }
}
