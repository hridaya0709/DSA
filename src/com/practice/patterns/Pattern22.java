package com.practice.patterns;

import java.util.Scanner;

public class Pattern22 {

//    n: 4
//            4444444
//            4333334
//            4322234
//            4321234
//            4322234
//            4333334
//            4444444

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int size = (2 * n) - 1;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int left = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int value = findMin(i, j, left, right);
                System.out.print(n - value);
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int findMin(int top, int bottom, int left, int right) {
        int result = Math.min(top, bottom);
        result = Math.min(result, left);
        result = Math.min(result, right);

        return result;
    }
}

