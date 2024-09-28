package com.bptn.course._mobilep;

import java.util.Scanner;

//import java.util.Scanner;

public class moblieplan {
	public static void main(String[] args) {
        // Locked part (variable declaration and print statement)
        int originalNumber = 1234; // Assume this variable is locked
        int reversed = 0;
        
        // Create a copy of the original number to perform the reverse operation
        int number = originalNumber; // Create a copy of the locked number

        // Logic to reverse the number
        while (number != 0) {
            int digit = number % 10;   // Extract the last digit
            reversed = reversed * 10 + digit;  // Add the last digit to the reversed number
            number = number / 10;  // Remove the last digit from the number
        }

        // Print the reversed number (4321)
        System.out.println(reversed);
    }
}

