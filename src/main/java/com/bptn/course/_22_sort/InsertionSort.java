package com.bptn.course._22_sort;

import java.util.Arrays;

public class InsertionSort {

	// Insertion Sort function
	static void insertionSort(int[] array) {
		int size = array.length; // Get the size of the array

		// Outer loop for each element
		for (int i = 1; i < size; i++) {
			int key = array[i]; // The element to be inserted
			int j = i - 1;

			// Inner loop to compare and shift elements
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j]; // Shift the element to the right
				j = j - 1;
			}
			array[j + 1] = key; // Place the key element in the correct position
		}
	}

	public static void main(String[] args) {
		// Sample data to be sorted
		int[] data = { 5, 3, -1, 7, 10, 2 };

		// Print the array before sorting
		System.out.println("Before sort: " + Arrays.toString(data));

		// Sort the array using insertion sort
		insertionSort(data);

		// Print the array after sorting
		System.out.println("After sort: " + Arrays.toString(data));
	}
}