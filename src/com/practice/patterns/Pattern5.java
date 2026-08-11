package com.practice.patterns;

import java.util.Scanner;

public class Pattern5 {

//    n: 4
//    ****
//    ***
//    **
//    *

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
