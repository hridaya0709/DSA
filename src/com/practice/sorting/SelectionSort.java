package com.practice.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    /*Given an array of N integers, write a program to implement the Selection sorting algorithm.

    Example 1:
    Input: N = 6, array[] = {13,46,24,52,20,9}
    Output: 9,13,20,24,46,52
    Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

    Example 2:
    Input: N=5, array[] = {5,4,3,2,1}
    Output: 1,2,3,4,5
    Explanation: After sorting the array is: 1, 2, 3, 4, 5*/


    /*Time Complexity:
    Worst-case / Average-case / Best-case : O(N^2)*/


    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After sorting: " + Arrays.toString(arr));

        scanner.close();
    }
}
