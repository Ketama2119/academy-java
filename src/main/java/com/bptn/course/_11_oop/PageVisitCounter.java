package com.bptn.course._11_oop;

public class PageVisitCounter {
	// Static variable to track the number of visits
    static int visitCount = 0;

    // Constructor to increment the visit count whenever a page is visited
    public PageVisitCounter() {
        visitCount++;  // Increment the static visitCount every time an instance is created
    }

    // Static method to get the current visit count
    public static int getVisitCount() {
        return visitCount;
    }

    // Non-static method to display that this method is instance-specific
    public void displayVisitMessage() {
        System.out.println("A new visitor has visited the page.");
    }

    public static void main(String[] args) {
        // Simulate page visits by creating instances
        PageVisitCounter visit1 = new PageVisitCounter();
        visit1.displayVisitMessage();
        
        PageVisitCounter visit2 = new PageVisitCounter();
        visit2.displayVisitMessage();

        // Display the total number of visits using the static method
        System.out.println("Total visits: " + PageVisitCounter.getVisitCount());
    }
}


