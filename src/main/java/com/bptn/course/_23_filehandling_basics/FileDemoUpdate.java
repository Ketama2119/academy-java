package com.bptn.course._23_filehandling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileDemoUpdate {

	public static void main(String[] args) {
		// Append to the file using FileWriter (pass 'true' to enable appending)
		try (FileWriter writer = new FileWriter("sample2.txt", true)) {
			writer.write("Appending this text to the file.\n");
			System.out.println("Data successfully appended to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while appending to the file.");
			e.printStackTrace();
		}
	}
}