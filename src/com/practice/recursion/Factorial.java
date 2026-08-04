package com.practice.recursion;

import java.util.Scanner;

public class Factorial {

    /*Given a number X,  print its factorial.
    To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.
    Note: X  is always a positive number.

    Example 1:
    Input:
    X = 5
    Output:
            120
    Explanation:
            5! = 5*4*3*2*1

    Example 2:
    Input:
    X = 3
    Output:
            6
    Explanation:
            3!=3*2*1*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();

        if(n < 0) {
            System.out.println(0);
            return;
        }

        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if(n == 1) return 1;

        return n * factorial(n-1);
    }
}
