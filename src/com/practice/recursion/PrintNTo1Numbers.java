package com.practice.recursion;

import java.util.Scanner;

public class PrintNTo1Numbers {
    /*Given an integer N, write a program to print numbers from N to 1.

    Input: N = 4
    Output: 4, 3, 2, 1
    Explanation: All the numbers from 4 to 1 are printed.

    Input: N = 1
    Output: 1
    Explanation: This is the base case.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        if(n < 0) return;

        print(n, n);
    }

    public static void print(int count, int n) {
         if(count == 0) return;
         else if(count < n) System.out.print(", ");

        System.out.print(count);
        print(--count, n);
    }
}
