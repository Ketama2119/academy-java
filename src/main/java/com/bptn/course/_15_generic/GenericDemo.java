package com.bptn.course._15_generic;

public class GenericDemo {
	// Generic method to print arrays
    public static <T> void printArray(T[] array) {
        // Enhanced for loop to iterate over the array elements
        for (T element : array) {
            System.out.println(element);  // Print each element
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = { 1, 2, 3 };
        
        // String array
        String[] stringArray = { "Hello", "Hi", "Bye" };

        // Call the generic method with different types of arrays
        printArray(intArray);  // Prints: 1, 2, 3
        printArray(stringArray);  // Prints: Hello, Hi, Bye
    }
}


