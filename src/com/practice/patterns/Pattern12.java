package com.practice.patterns;

import java.util.Scanner;

public class Pattern12 {

//    n: 4
//            1      1
//            12    21
//            123  321
//            12344321

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        int space = 2 * (n - 1);
        for(int i = 0; i < n; i++) {
            int k = 1;
            for(int j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }

            if(space > 0) {
                for(int j = space; j > 0; j--) {
                    System.out.print(" ");
                }
            }

//
//            for(int j = (n+1-(2 * i)); j >= 0; j -= 2) {
//                System.out.print(" ");
//            }

            int l = i+1;
            for(int j = i; j >= 0; j--) {
                System.out.print(l);
                l--;
            }

            space-=2;
            System.out.println();
        }

    }
}
