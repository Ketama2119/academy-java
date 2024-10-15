package com.bptn.junit_books;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TextBookUnitTest {

//public class TextbookUnitTest {

	// Test case 1: Verifying getTitle() method
	@Test
	public void testGetTitle() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science", tb.getTitle(), "Title should be 'Computer Science'");
	}

	// Test case 2: Verifying getEdition() method
	@Test
	public void testGetEdition() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals(9, tb.getEdition(), "Edition should be 9");
	}

	// Test case 3: Verifying getBookInfo() method
	@Test
	public void testGetBookInfo() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		assertEquals("Computer Science-14.99-9", tb.getBookInfo(), "Book info should match the expected format");
	}

	// Test case 4: Verifying canSubstituteFor() when substitution is allowed
	@Test
	public void testCanSubstituteFor_canSubstitute() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Computer Science", 19.99, 2);
		assertEquals(true, tb.canSubstituteFor(tb2),
				"Textbooks with the same title and higher or equal edition should be substitutable");
	}

	// Test case 5: Verifying canSubstituteFor() when substitution is not allowed
	@Test
	public void testCanSubstituteFor_cannotSubstitute() {
		Textbook tb = new Textbook("Computer Science", 14.99, 9);
		Textbook tb2 = new Textbook("Basketweaving", 19.99, 2);
		assertEquals(false, tb.canSubstituteFor(tb2), "Textbooks with different titles should not be substitutable");
	}
}
