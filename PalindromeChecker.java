//Author By: SHRUTI DILIP GODSE....
//Code Palindrome checker

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println("YES, IT IS A PALINDROME");
        } else {
            System.out.println("NO, IT IS NOT A PALINDROME");
        }
    }

    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase for case-insensitive check
        word = word.toLowerCase();

        // Initialize two pointers at the start and end of the word
        int start = 0;
        int end = word.length() - 1;

        // Iterate until the pointers meet in the middle
        while (start < end) {
            // If the characters at the start and end are not the same, it's not a palindrome
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }

            // Move the pointers inward
            start++;
            end--;
        }

        // If the loop completes without finding a mismatch, it's a palindrome
        return true;
    }
}
