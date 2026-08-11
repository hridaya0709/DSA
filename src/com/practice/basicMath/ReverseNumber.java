package com.practice.basicMath;

import java.util.Scanner;

public class ReverseNumber {
    /*Reverse a number
    You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

    Example 1
    Input: n = 25
    Output: 52
    Explanation: Reverse of 25 is 52.

    Example 2
    Input: n = 123
    Output: 321
    Explanation: Reverse of 123 is 321.

    Constraints
    0 <= n <= 5000
    n will contain no leading zeroes except when it is 0 itself.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n >= 0 && n <= 9) {
            System.out.println(n);
            return;
        }

        int reverse = 0;
        for(int i = n; i > 0; i/=10) {
            int remainder = i%10;
            reverse = reverse * 10 + remainder;
        }

        System.out.println(reverse);

        scanner.close();
    }
}
