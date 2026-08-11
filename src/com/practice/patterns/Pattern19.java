package com.practice.patterns;

import java.util.Scanner;

public class Pattern19 {

//    n: 4
//            ********
//            ***  ***
//            **    **
//            *      *
//            *      *
//            **    **
//            ***  ***
//            ********

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int space = 0;
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for(int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            space+=2;

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        space = 2 * (n-1);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for(int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            space-=2;

            for(int j = 0; j <=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
