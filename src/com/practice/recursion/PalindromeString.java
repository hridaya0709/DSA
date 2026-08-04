package com.practice.recursion;

import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.Scanner;

public class PalindromeString {

    /*Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

    Example 1:
    Input: Str =  “ABCDCBA”
    Output: Palindrome
    Explanation: String when reversed is the same as string.

    Example 2:
    Input: Str = “TAKE U FORWARD”
    Output: Not Palindrome
    Explanation: String when reversed is not the same as string.*/

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String string = new Scanner(System.in).nextLine();

        char[] reverseString = reverse(string.toCharArray(), new char[string.length()], 0, string.length()-1);
        //System.out.println(reverseString);
        if(string.equalsIgnoreCase(new String(reverseString))) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    public static char[] reverse(char[] stringArr, char[] reverseArr, int start, int end) {
        if(end < 0) return reverseArr;

        reverseArr[start] = stringArr[end];
        return reverse(stringArr, reverseArr, ++start, --end);
    }
}
