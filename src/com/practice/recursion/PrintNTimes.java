package com.practice.recursion;

import java.util.Scanner;

public class PrintNTimes {
/*    Given an integer N, write a program to print your name N times.

    Input: N = 3
    Output: Ashish Ashish Ashish
    Explanation: Name is printed 3 times.

    Input: N = 1
    Output: Ashish
    Explanation: Name is printed once.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        if(n < 0) return;

        int count = 0;
        print(count, n);
    }

    public static void print(int count, int n) {
        if(count == n) return;
        System.out.println("Hridaya");
        print(++count, n);
    }
}
