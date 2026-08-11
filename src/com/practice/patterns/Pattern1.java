package com.practice.patterns;

import java.util.Scanner;

public class Pattern1 {

//    n = 4
//    ****
//    ****
//    ****
//    ****

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }

}
