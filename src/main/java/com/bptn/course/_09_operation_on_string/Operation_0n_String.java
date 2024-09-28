package com.bptn.course._09_operation_on_string;

import java.util.Scanner;

public class Operation_0n_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // Scanner to read user input
        int choice;

        // Main loop to continue the menu until the user decides to exit
        do {
            // Display the menu options
            System.out.println("String Menu");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of a String");
            System.out.print("Enter the option: ");

            choice = scanner.nextInt();  // Read the user's choice
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:  // Palindrome Check
                    System.out.println("Palindrome Check");
                    System.out.print("Enter a string: ");
                    String palindromeStr = scanner.nextLine();
                    if (isPalindrome(palindromeStr)) {
                        System.out.println(palindromeStr + " is a palindrome");
                    } else {
                        System.out.println(palindromeStr + " is not a palindrome");
                    }
                    break;

                case 2:  // Reverse a String
                    System.out.println("Reverse a String");
                    System.out.print("Enter a string: ");
                    String reverseStr = scanner.nextLine();
                    System.out.println("Reversed string: " + reverseString(reverseStr));
                    break;

                case 3:  // Concatenate two Strings
                    System.out.println("Concatenate two Strings");
                    System.out.print("Enter First string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter Second string: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Concatenated string: " + str1 + str2);
                    break;

                case 4:  // String Comparison
                    System.out.println("String Comparison");
                    System.out.print("Enter First string: ");
                    String compareStr1 = scanner.nextLine();
                    System.out.print("Enter Second string: ");
                    String compareStr2 = scanner.nextLine();
                    if (compareStr1.equals(compareStr2)) {
                        System.out.println("The entered strings are equal");
                    } else {
                        System.out.println("The entered strings are not equal");
                    }
                    break;

                case 5:  // Calculate the Length of a String
                    System.out.println("Length of a String");
                    System.out.print("Enter a string: ");
                    String lengthStr = scanner.nextLine();
                    System.out.println("The length of the entered string is: " + lengthStr.length());
                    break;

                default:  // Invalid Choice
                    System.out.println("Invalid choice! Please make a valid choice.");
                    break;
            }

            // Prompt the user if they want to continue
            System.out.println("To continue, press 1. To exit, press any other number.");
            choice = scanner.nextInt();

        } while (choice == 1);  // Loop back to the menu if the user presses 1 to continue

        scanner.close();  // Close the scanner to avoid resource leak
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();

	}

}
