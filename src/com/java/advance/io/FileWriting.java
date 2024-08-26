package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) {
		String msg = "Hey Hi\n Hello \n Java is coming to \t End .....\n ..";

		File file = new File(FilePaths.PATH_OF_SAMPLE_FILE);

		if (file.exists()) {

			try(FileOutputStream fos = new FileOutputStream(file);) {
				
				fos.write(msg.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Invalid File");
		}

	}

}
