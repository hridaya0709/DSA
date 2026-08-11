package com.practice.patterns;

import java.util.Scanner;

public class Pattern17 {

//    n: 4
//             A
//            ABA
//           ABCAB
//          ABCDABC

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = n-i-1; j > 0; j--){
                System.out.print(" ");
            }

            char ch = 'A';
            for(int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            ch = 'A';
            for(int j = 0; j < i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

        scanner.close();
    }
}
