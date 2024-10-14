package com.bptn.course._16_array_list;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// Create an ArrayList to store String elements
		ArrayList<String> names = new ArrayList<String>();

		// Add elements to the ArrayList
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		// out put using enhanced loop
		for (String elment : names) {
			System.out.println(elment);

		}
		System.out.println(names.size());

//		// Print the ArrayList
//		System.out.println("Names: " + names); // Output: Names: [Alice, Bob, Charlie]
//
//		// Get an element by index
//		String secondName = names.get(1);
//		System.out.println("Second Name: " + secondName); // Output: Bob
//
//		// Remove an element by index
//		names.remove(0);
//		System.out.println("After removal: " + names); // Output: [Bob, Charlie]
//
//		// Set (replace) an element
//		names.set(1, "David");
//		System.out.println("After replacement: " + names); // Output: [Bob, David]
//
//		// Get the size of the ArrayList
//		System.out.println("Size: " + names.size()); // Output: 2
	}
}