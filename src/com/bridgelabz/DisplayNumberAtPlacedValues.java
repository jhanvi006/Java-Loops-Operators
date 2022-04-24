package com.bridgelabz;

import java.util.Scanner;

public class DisplayNumberAtPlacedValues {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int unit, tens, hundreds, thousands;
        if (num <= 9999) {
            unit = num % 10;
            tens = (num / 10) % 10;
            hundreds = (num / 100) % 10;
            thousands = (num / 1000) % 10;
            System.out.println("Unit digit: "+unit);
            System.out.println("Tens digit: "+tens);
            System.out.println("Hundreds digit: "+hundreds);
            System.out.println("Thousands digit: "+thousands);
        }
        else
            System.out.println("Invalid number");
    }
}
