package com.practice.patterns;

import java.util.Scanner;

public class Pattern16 {

//    n: 4
//            A
//            BB
//            CCC
//            DDDD
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        char ch = 'A';
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }

        scanner.close();
    }
}
