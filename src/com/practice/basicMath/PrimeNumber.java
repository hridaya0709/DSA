package com.practice.basicMath;

import java.util.Scanner;

public class PrimeNumber {
    //Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n == 1 || n % 2 == 0) {
            System.out.println("Not Prime number");
            return;
        }

        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                System.out.println("Not Prime number");
                break;
            }
        }

        System.out.println("Prime number");

        scanner.close();
    }
}
