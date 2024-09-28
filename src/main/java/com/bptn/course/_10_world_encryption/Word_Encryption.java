package com.bptn.course._10_world_encryption;

import java.util.Scanner;

public class Word_Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      
	        // Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a word to encrypt
	        System.out.print("Enter a word to encrypt: ");
	        String word = scanner.nextLine();  // Read the input word

	        // Encrypt the word using the encryption algorithm
	        String encryptedWord = encryptWord(word);

	        // Display the encrypted word
	        System.out.println("Encrypted word: " + encryptedWord);

	        // Close the scanner to prevent resource leak
	        scanner.close();
	    }

	    /**
	     * Encrypts a word by shifting each letter by one position in the alphabet.
	     * Non-alphabetic characters remain unchanged.
	     * 
	     * @param word The input word to encrypt.
	     * @return The encrypted word.
	     */
	    public static String encryptWord(String word) {
	        StringBuilder encrypted = new StringBuilder();  // StringBuilder to hold the encrypted word

	        // Iterate through each character of the input word
	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);  // Get the current character

	            // Check if the character is a lowercase letter (a-z)
	            if (ch >= 'a' && ch <= 'z') {
	                // Shift by one and handle wrap-around using modulo
	                char encryptedChar = (char) ((ch - 'a' + 1) % 26 + 'a');
	                encrypted.append(encryptedChar);
	            }
	            // Check if the character is an uppercase letter (A-Z)
	            else if (ch >= 'A' && ch <= 'Z') {
	                // Shift by one and handle wrap-around using modulo
	                char encryptedChar = (char) ((ch - 'A' + 1) % 26 + 'A');
	                encrypted.append(encryptedChar);
	            }
	            // If the character is non-alphabetic, leave it unchanged
	            else {
	                encrypted.append(ch);
	            }
	        }

	        // Return the encrypted word as a string
	        return encrypted.toString();
	}

}
