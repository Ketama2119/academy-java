package com.bptn.course._22_sort;

public class GenericDemo {

	// Generic method to print two values of any type
	public static <T> void findMaxGeneric(T num1, T num2) {
		System.out.println("You provided the following data: " + num1 + ", " + num2);
	}

	// Method to find the maximum of two integers using ternary operator
	public static int findMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2; // Ternary operator to find the maximum
	}

	public static void main(String[] args) {
		// Testing the findMax method with integers
		System.out.println("Max of 10 and 20: " + findMax(10, 20));

		// Testing the generic findMaxGeneric method with integers
		findMaxGeneric(10, 20);

		// Testing the generic findMaxGeneric method with doubles
		findMaxGeneric(10.6, 20.8);
	}
}