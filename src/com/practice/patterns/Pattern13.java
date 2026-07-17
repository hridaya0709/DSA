package com.practice.patterns;

import java.util.Scanner;

public class Pattern13 {

//    n: 4
//            1
//            2 3
//            4 5 6
//            7 8 9 10

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        int k = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
