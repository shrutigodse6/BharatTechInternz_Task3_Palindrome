#BharatTechInternz_Task3_PalindromeChecker

By Shruti Dilip Godse

Task 3:- Create Palindrome check.
 Required things:

 The user can check whether the entered word is palindrome or
 not.
 The result should be displayed as:
Ø If it is palindrome then print “YES, IT IS PALINDROME”
 If it is not a palindrome then print “NO, IT IS NOT A PALINDROME”

 Here's a Java program that checks if a word is a palindrome or not:


Here's how the program works:

The user is prompted to enter a word using the Scanner class.
The isPalindrome method is called with the entered word as an argument.
Inside the isPalindrome method:
The word is converted to lowercase to perform a case-insensitive check.
Two pointers, start and end, are initialized at the start and end of the word, respectively.
A loop runs until the pointers meet in the middle.
Inside the loop, the characters at the start and end positions are compared.
If they are different, the method returns false (not a palindrome).
If they are the same, the pointers are moved inward.
If the loop completes without finding a mismatch, the method returns true (palindrome).
Based on the return value of the isPalindrome method, the appropriate message is printed to the console.
When you run the program, it will prompt you to enter a word. After entering a word and pressing Enter, it will display whether the word is a palindrome or not.

