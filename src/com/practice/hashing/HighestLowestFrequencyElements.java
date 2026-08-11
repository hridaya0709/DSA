package com.practice.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFrequencyElements {
    /*Problem Statement: Given an array of size N. Find the highest and lowest frequency element.

    Example 1:
    Input: array[] = {10,5,10,15,10,5};
    Output: 10 15
    Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.

    Example 2:
    Input: array[] = {2,2,3,4,4,2};
    Output: 2 3
    Explanation: The frequency of 2 is 3, i.e. the highest and the frequency of 3 is 1 i.e. the lowest.*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements one by one: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lowest = arr[0];
        int highest = arr[0];
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getValue() < map.get(lowest)) lowest = m.getKey();
            if(m.getValue() > map.get(highest)) highest = m.getKey();
        }

        System.out.println(highest + " " + lowest);

        scanner.close();
    }
}
