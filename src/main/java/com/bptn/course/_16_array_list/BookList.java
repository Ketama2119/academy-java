package com.bptn.course._16_array_list;
import java.util.ArrayList;

public class BookList {
   public static void main(String[] args) {
      // Create a new ArrayList called myBooks to store books
      ArrayList<String> myBooks = new ArrayList<String>();

      // Add three favorite books to the list
      myBooks.add("1984 by George Orwell");
      myBooks.add("To Kill a Mockingbird by Harper Lee");
      myBooks.add("The Great Gatsby by F. Scott Fitzgerald");

      // Display all books (Read part of CRUD)
      System.out.println("Here are the books in your list:");
      for (String book : myBooks) {
         System.out.println(book);
      }

      // Remove the second book (index 1) from the list (Delete part of CRUD)
      myBooks.remove(1);
      System.out.println("\nMy favorite books are: " + myBooks);

      // Search for a book (contains() method with toLowerCase())
      String searchBook = "harry potter";  // Searching for "harry potter"
      boolean found = false;

      // Loop through the book list to compare lowercased versions of the books
      for (String book : myBooks) {
         if (book.toLowerCase().contains(searchBook.toLowerCase())) {
            found = true;
            break;
         }
      }

      if (found) {
         System.out.println("Book found");
      } else {
         System.out.println("Book not found");
      }

      // Display the size of the list and the last item in the list
      System.out.println("The size of the list is: " + myBooks.size());
      System.out.println("The last item of the list is: " + myBooks.get(myBooks.size() - 1));
   }
}