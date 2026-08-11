package com.practice.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    /*Given an array of integers called nums, sort the array in non-decreasing order using the insertion sort algorithm and return the sorted array.
    A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.

    Example 1:
    Input:
    nums = [7, 4, 1, 5, 3]
    Output:
            [1, 3, 4, 5, 7]
    Explanation:
    The array is sorted in non-decreasing order: 1 ≤ 3 ≤ 4 ≤ 5 ≤ 7.

    Example 2:
    Input:
    nums = [5, 4, 4, 1, 1]
    Output:
            [1, 1, 4, 4, 5]
    Explanation:
    The array is sorted in non-decreasing order: 1 ≤ 1 ≤ 4 ≤ 4 ≤ 5.*/

    /*Time Complexity:
    Worst-case / Average-case / Best-case: O(N^2)*/

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
        for(int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

//        for(int i = 1; i < n; i++) {
//            int current = arr[i];
//            int j = i - 1;
//            for(; j >=0 && arr[j] > current; j--) {
//                arr[j + 1] = arr[j];
//            }
//
//            arr[j + 1] = current;
//        }

        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
