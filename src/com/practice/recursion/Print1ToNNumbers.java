package com.practice.recursion;

import java.util.Scanner;

public class Print1ToNNumbers {
    /*Given an integer N, write a program to print numbers from 1 to N.

    Input: N = 4
    Output: 1, 2, 3, 4
    Explanation: All the numbers from 1 to 4 are printed.

    Input: N = 1
    Output: 1
    Explanation: This is the base case.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        if(n < 0) return;

        int count = 1;
        print(count, n);
    }

    public static void print(int count, int n) {
        if(count == n+1) return;
        else if(count > 1) System.out.print(", ");

        System.out.print(count);
        print(++count, n);
    }
}
