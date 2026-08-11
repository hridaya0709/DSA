package com.practice.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElement {
    /*Given an array, we have to find the number of occurrences of each element in the array.

    Example 1:
    Input: arr[] = {10,5,10,15,10,5};
    Output: 10  3
            5  2
            15  1
    Explanation: 10 occurs 3 times in the array
	      5 occurs 2 times in the array
              15 occurs 1 time in the array

    Example2:
    Input: arr[] = {2,2,3,4,4,2};
    Output: 2  3
            3  1
            4  2
    Explanation: 2 occurs 3 times in the array
	     3 occurs 1 time in the array
             4 occurs 2 time in the array*/
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements one by one: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i] , 0) + 1);
        }

        for(Map.Entry<Integer, Integer> m: map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        scanner.close();
    }
}
