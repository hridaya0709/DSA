package com.practice.patterns;

import java.util.Scanner;

public class Pattern20 {

//    n: 4
//            *     *
//            **   **
//            *** ***
//            *******
//            *** ***
//            **   **
//            *     *

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        int space = (2 * n) - 3;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            for(int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            space -= 2;

            for(int j = 0; j <= i; j++) {
                if (j < n-1)
                    System.out.print("*");
            }

            System.out.println();
        }

        space = 1;
        for(int i = 0; i < n; i++) {
            for(int j = n-i-1; j > 0; j--) {
                System.out.print("*");
            }

            for(int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            space += 2;

            for(int j = n-i-1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
