package com.practice.basicMath;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisorsOfNumber {
    /*Divisors of a Number

    You are given an integer n. You need to find all the divisors of n. Return all the divisors of n as an array or list in a sorted order.
    A number which completely divides another number is called it's divisor.

    Example 1
    Input: n = 6
    Output = [1, 2, 3, 6]
    Explanation: The divisors of 6 are 1, 2, 3, 6.

    Example 2
    Input: n = 8
    Output: [1, 2, 4, 8]
    Explanation: The divisors of 8 are 1, 2, 4, 8.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++) {
            if(n%i == 0) list.add(i);
        }

        System.out.println(list);
        scanner.close();
    }
}
