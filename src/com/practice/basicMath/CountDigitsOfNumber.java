package com.practice.basicMath;

import java.util.Scanner;

public class CountDigitsOfNumber {

    /*Count all Digits of a Number
    You are given an integer n. You need to return the number of digits in the number.
    The number will have no leading zeroes, except when the number is 0 itself.

    Example 1
    Input: n = 4
    Output: 1
    Explanation: There is only 1 digit in 4.

    Example 2
    Input: n = 14
    Output: 2
    Explanation: There are 2 digits in 14.

    Constraints
    0 <= n <= 5000
    n will contain no leading zeroes except when it is 0 itself.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        int counter = 0;
        if(n == 0) {
            System.out.println(++counter);
            return;
        }

        for(long i = n; i > 0; i/=10) {
            counter++;
        }
        System.out.println(counter);

        scanner.close();
    }
}
