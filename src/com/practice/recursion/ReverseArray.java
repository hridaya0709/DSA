package com.practice.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    /*You are given an array. The task is to reverse the array and print it.

    Input: N = 5, arr[] = {5,4,3,2,1}
    Output: {1,2,3,4,5}
    Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

    Input: N=6 arr[] = {10,20,30,40}
    Output: {40,30,20,10}
    Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Enter " + n + " elements: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }

        int[] reverseArr = new int[n];
        reverseArr = reverseArray(arr, reverseArr, 0, n-1, n/2);
        System.out.println(Arrays.toString(reverseArr));
    }

    public static int[] reverseArray(int[] arr, int[] reverseArr, int start, int end, int mid) {
        if(end < 0) return reverseArr;

        reverseArr[end] = arr[start];
        return reverseArray(arr, reverseArr, ++start, --end, mid);
    }
}
