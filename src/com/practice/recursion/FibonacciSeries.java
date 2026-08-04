package com.practice.recursion;

import java.util.Scanner;

public class FibonacciSeries {
    /*Given an integer N. Print the Fibonacci series up to the Nth term.

    Example 1:
    Input: N = 5
    Output: 0 1 1 2 3 5
    Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

    Example 2:
    Input: 6
    Output: 0 1 1 2 3 5 8
    Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        if(n == 0) return;

        printFibonacci(0,0, 1, n);
    }

    private static void printFibonacci(int count, int n1, int n2, int n) {
        if(count > n) return;

        System.out.print(n1 + " ");
        printFibonacci(++count, n2, n1+n2, n);
    }
}
