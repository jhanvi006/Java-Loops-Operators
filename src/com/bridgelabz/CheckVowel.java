package com.bridgelabz;

import java.util.Scanner;

public class CheckVowel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0);
        switch (character){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(character+" is a vowel.");
                break;
            default:
                System.out.println(character+" is a consonant.");
        }
    }
}
