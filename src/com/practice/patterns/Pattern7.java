package com.practice.patterns;

import java.util.Scanner;

public class Pattern7 {

//    n: 4
//               *
//              ***
//             *****
//            *******

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
