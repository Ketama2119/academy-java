package com.bptn.course._22_sort;

import java.util.HashMap;
import java.util.Map;

class Student {
	String name;
	Map<String, Double> scores;

	public Student(String name, Map<String, Double> scores) {
		this.name = name;
		this.scores = scores;
	}

	public String getName() {
		return name;
	}

	public Map<String, Double> getScores() {
		return scores;
	}
}

public class StudentScores {

	// Method to calculate the average score for a student
	public static double calculateAverage(Student student, Map<String, Double> scores) {
		double sum = 0;
		int count = 0;

		// Iterate over the scores using a for-each loop with the map entries
		for (double score : scores.values()) {
			sum += score; // Add each score to the sum
			count++; // Increment the count of courses
		}

		// Return the average score
		return sum / count;
	}

	public static void main(String[] args) {
		// Create a map of course scores for the student
		Map<String, Double> scores = new HashMap<>();
		scores.put("course1", 90.0);
		scores.put("course2", 75.5);
		scores.put("course3", 98.3);

		// Create a student with their scores
		Student s1 = new Student("Student One", scores);

		// Calculate and print the average score for the student
		System.out.println("The average score is: " + calculateAverage(s1, scores));
	}
}