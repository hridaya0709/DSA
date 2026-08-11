package com.practice.patterns;

import java.util.Scanner;

public class Pattern18 {

//    n: 4
//            D
//            CD
//            BCD
//            ABCD

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            char ch = 'A';
            ch += (char) (n-i-1);
            for(int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
