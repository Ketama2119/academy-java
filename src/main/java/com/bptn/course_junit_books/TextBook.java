package com.bptn.course_junit_books;

public class TextBook extends Book {
	// Private instance variable for the edition of the textbook
	private int edition;

	// Constructor that initializes the title, price, and edition
	public TextBook(String title, double price, int edition) {
		super(title, price); // Call the superclass (Book) constructor
		this.edition = edition; // Set the edition of the textbook
	}

	// Method to get the edition of the textbook
	public int getEdition() {
		return edition;
	}

	// Overridden method to include edition information in the book info
	@Override
	public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	}

	// Method to check if this textbook can substitute for another
	public boolean canSubstituteFor(TextBook other) {
		return this.getEdition() >= other.getEdition() && this.getTitle().equals(other.getTitle());
	}
}