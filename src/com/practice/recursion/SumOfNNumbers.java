package com.practice.recursion;

import java.util.Scanner;

public class SumOfNNumbers {
    /*Given a number ‘N’, find out the sum of the first N natural numbers .

    Input: N=5
    Output: 15
    Explanation: 1+2+3+4+5=15

    Input: N=6
    Output: 21
    Explanation: 1+2+3+4+5+6=15*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = calculateSum(n);
        System.out.println(result);

        scanner.close();
    }

    public static int calculateSum(int n) {
        if(n == 0) {
            return 0;
        }

        return n + calculateSum(n-1);
    }

//    public static void main(String[] args) {
//        System.out.print("Enter n: ");
//        int n = new Scanner(System.in).nextInt();
//
//        if(n < 0) return;
//        if(n < 2) System.out.print(n);
//
//        int count = 1;
//        int sum = 0;
//        int result = calculateSum(count, n, sum);
//        System.out.println(result);
//    }
//
//    public static int calculateSum(int count, int n, int sum) {
//        if(count == n+1) {
//            return sum;
//        }
//
//        sum += count;
//        return calculateSum(++count, n, sum);
//    }

//    public static void main(String[] args) {
//        System.out.print("Enter n: ");
//        int n = new Scanner(System.in).nextInt();
//
//        if(n < 0) return;
//        if(n < 2) System.out.print(n);
//
//        int count = 1;
//        int sum = 0;
//        calculateSum(count, n, sum);
//    }
//
//    public static void calculateSum(int count, int n, int sum) {
//        if(count == n+1) {
//            System.out.println(sum);
//            return;
//        }
//
//        sum += count;
//        calculateSum(++count, n, sum);
//    }
}
