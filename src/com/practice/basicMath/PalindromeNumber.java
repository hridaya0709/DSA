package com.practice.basicMath;

import java.util.Scanner;

public class PalindromeNumber {

    /*Example 1:
    Input:N = 4554
    Output:Palindrome Number
    Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

    Example 2:
    Input:N = 7789
    Output: Not Palindrome
    Explanation: The reverse of number 7789 is 9877 and therefore it is not palindrome*/

    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n >= 0 && n <= 9) {
            System.out.println("Palindrome");
            return;
        }

        int reverse = 0;
        for(int i = n; i > 0; i/=10) {
            int remainder = i%10;
            reverse = reverse * 10 + remainder;
        }

        if(reverse == n) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

        scanner.close();
    }
}
