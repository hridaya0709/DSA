package com.practice.patterns;

import java.util.Scanner;

public class Pattern4 {

//    n = 4
//    1
//    22
//    333
//    4444

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
