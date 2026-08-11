package com.practice.basicMath;

import java.util.Scanner;

public class ArmstrongNumber {

    /*Check if the Number is Armstrong

    You are given an integer n. You need to check whether it is an armstrong number or not. Return true if it is an armstrong number, otherwise return false.
    An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.


    Example 1
    Input: n = 153
    Output: true
    Explanation: Number of digits : 3.
    1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
    Therefore, it is an Armstrong number.

    Example 2
    Input: n = 12
    Output: false
    Explanation: Number of digits : 2.
    1^2 + 2^2 = 1 + 4 = 5.
    Therefore, it is not an Armstrong number.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n == 0 || n == 1) {
            System.out.println("Armstrong Number");
            return;
        }

        int count = 0;
        for(int i = n; i > 0; i/=10) {
            count++;
        }

        int armstrong = 0;
        for(int i = n; i > 0; i/=10) {
            armstrong += (int) Math.pow((i%10), count);
        }

        if(armstrong == n) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");

        scanner.close();
    }
}
