package com.bptn.course_junit_books;

public class Book {
	// Private instance variables for the title and price of the book
	private String title;
	private double price;

	// Constructor to initialize the title and price
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	// Getter method for the title
	public String getTitle() {
		return title;
	}

	// Method to get the book information as a concatenated string
	public String getBookInfo() {
		return title + "-" + price;
	}
}