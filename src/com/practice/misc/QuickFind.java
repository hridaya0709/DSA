package com.practice.misc;

import java.util.Scanner;

public class QuickFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to create: ");
        int n = scanner.nextInt();

        int[] list = new int[n];
        for(int i = 0; i < n; i++) {
            list[i] = i;
        }

        System.out.println("Elements created.");

        String userInput;
        do {
            System.out.println("""
                    What operation do you want to perform?\s
                    A. Create connection\s
                    B. Find connection\s
                    C. Print List""");
            userInput = scanner.next().trim();

            switch (userInput) {
                case "A" -> {
                    System.out.println("Enter the two elements that you want to join. Enter only from 0 to " + (n - 1) +
                            " separated by a comma");
                    String userSelection = scanner.next();
                    String[] values = userSelection.split(",");
                    boolean result = joinElements(list, Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                    System.out.println(result);
                }
                case "B" -> {
                    System.out.println("Enter the two elements that you want to find if connection is there. Enter only from 0 to "
                            + (n - 1) + " separated by a comma");
                    String userSelection = scanner.next();
                    String[] values = userSelection.split(",");
                    boolean result = findJoin(list, Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                    System.out.println(result);
                }
                case "C" -> printList(list);
                default -> System.out.println("Exiting...");
            }
        }
        while(userInput.equals("A") || userInput.equals("B") || userInput.equals("C"));


    }

    public static boolean joinElements(int[] list, int a, int b){

        if (!findJoin(list, a, b)) {
            try {
                findAndUpdateConnectedSiblings(list, a, b);
            } catch (Exception exception) {
                return false;
            }
        }
        return true;
    }

    public static boolean findJoin(int[] list, int a, int b){
        return list[a] == list[b];
    }

    public static void findAndUpdateConnectedSiblings(int[] list, int a, int b){
        for(int i = 0; i < list.length; i++) {
            if(list[i] == b) {
                list[i] = list[a];
            }
        }
    }

    public static void printList(int[] list) {
        for(int i = 0; i < list.length; i++) {
            System.out.println("Index " + i + " : " + list[i]);
        }
    }

}
