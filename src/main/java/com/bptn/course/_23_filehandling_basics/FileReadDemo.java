package com.bptn.course._23_filehandling_basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// Using try-with-resources to automatically close the FileReader and
		// BufferedReader
		try (FileReader reader = new FileReader("sample2.txt");
				BufferedReader bufferedReader = new BufferedReader(reader)) {

			String line;
			// Reading the file line by line
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line); // Print each line to the console
			}

		} catch (IOException e) {
			System.out.println("Something went wrong while reading the file: " + e.getMessage());
			e.printStackTrace(); // Print detailed error information
		}
	}
}
