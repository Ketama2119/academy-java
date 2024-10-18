package com.bptn.course._23_filehandling_basics;

import java.io.File;

public class FileDeleteDemo {
	public static void main(String[] args) {
		// Specify the file to delete
		File file = new File("sample2.txt");

		// Attempt to delete the file
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("File deleted!");
			} else {
				System.out.println("Failed to delete the file.");
			}
		} else {
			System.out.println("File does not exist.");
		}
	}
}