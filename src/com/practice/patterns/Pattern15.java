package com.practice.patterns;

import java.util.Scanner;

public class Pattern15 {

//    n: 4
//            ABCD
//            ABC
//            AB
//            A

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = n; i > 0; i--) {
            char ch = 'A';
            for(int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
