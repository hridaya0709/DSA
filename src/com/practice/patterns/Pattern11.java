package com.practice.patterns;

import java.util.Scanner;

public class Pattern11 {

//    n: 4
//            1
//            01
//            101
//            0101

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k;
        for(int i = 0; i < n; i++) {
            k = (i % 2 == 0) ? 0 : 1;
            for(int j = 0; j <= i; j++) {
                k = (k == 0) ? 1 : 0;
                System.out.print(k);
            }
            System.out.println();
        }

        scanner.close();
    }
}
