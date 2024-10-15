package com.bptn.junit_books;

public class Textbook extends Book {
	private int edition;

	public Textbook(String title, double price, int edition) {
		super(title, price); // Call the constructor of Book
		this.edition = edition;
	}

	public int getEdition() {
		return edition;
	}

	@Override
	public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	}

	public boolean canSubstituteFor(Textbook other) {
		return this.getTitle().equals(other.getTitle()) && this.edition >= other.getEdition();
	}
}