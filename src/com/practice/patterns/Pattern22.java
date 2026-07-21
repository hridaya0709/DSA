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
        int n = new Scanner(System.in).nextInt();

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
    }

    public static int findMin(int top, int bottom, int left, int right) {
        int result = Math.min(top, bottom);
        result = Math.min(result, left);
        result = Math.min(result, right);

        return result;
    }
}


//package com.practice.patterns;
//
//import java.util.Scanner;
//
//public class Pattern22 {
//
//    public static void main(String[] args) {
//        System.out.print("Enter n: ");
//        int n = new Scanner(System.in).nextInt();
//
//        int size = (2 * n) - 1;
//        int k = n;
//        for(int i = 0; i < size; i++) {
//            for(int j = 0; j < size; j++) {
//                if(i == n-1 && j == n-1) {
//                    k--;
//                    System.out.print(k);
//                    k++;
//                }
//                else if(i == j && i != 0 && i < n) {
//                    k--;
//                    System.out.print(k);
//                }
//                else if(i == 0 || j == 0 || i == size-1 || j == size-1) {
//                    System.out.print(n);
//                }
//                else {
//                    System.out.print(k);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

