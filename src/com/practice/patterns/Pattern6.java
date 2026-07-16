package com.practice.patterns;

import java.util.Scanner;

public class Pattern6 {

//    n: 4
//            1234
//            123
//            12
//            1

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
