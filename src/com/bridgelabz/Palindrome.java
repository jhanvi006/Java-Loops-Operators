package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
        int num_copy = num;
        int rev_num = 0;
        for (;num>0 ;num=num/10){
            rev_num = rev_num*10 + num%10;
        }
        if(num_copy == rev_num)
            System.out.println("The number "+num_copy+" is palindrome.");
        else
            System.out.println("The number "+num_copy+" is not palindrome.");
    }
}
