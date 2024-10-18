package com.bptn.course._23_filehandling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {
	public static void main(String[] args) {
		// Using try-with-resources to automatically close the FileWriter
		try (FileWriter writer = new FileWriter("sample2.txt")) {
			writer.write("This is a new file!");
			System.out.println("File created!");
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file: ");
			e.printStackTrace();
		}
	}
}
