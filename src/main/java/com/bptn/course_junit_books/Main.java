package com.bptn.course_junit_books;

import com.bptn.junit_books.Textbook;

public class Main {

	public static void main(String[] args) {
		// Creating two Textbook instances
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);

		// Displaying the properties of the first textbook
		System.out.println("Title: " + tb.getTitle());
		System.out.println("Edition: " + tb.getEdition());
		System.out.println("Book Info: " + tb.getBookInfo());
		System.out.println("Can substitute for tb2: " + tb.canSubstituteFor(tb2));

		// Displaying the properties of the second textbook
		System.out.println("\nTitle: " + tb2.getTitle());
		System.out.println("Edition: " + tb2.getEdition());
		System.out.println("Book Info: " + tb2.getBookInfo());
		System.out.println("Can substitute for tb: " + tb2.canSubstituteFor(tb));
	}
}