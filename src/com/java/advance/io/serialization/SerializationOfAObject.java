package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.java.advance.io.FilePaths;

public class SerializationOfAObject {

	public static void main(String[] args) {
		Student st = new Student(4, "Harpreet");
		System.out.println(st);

		File file = new File(FilePaths.PATH_OF_SERIAL_FILE);

		if (file.exists()) {

			try (FileOutputStream fos = new FileOutputStream(file);//
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				
				oos.writeObject(st);
				

			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Invalid File");
		}

	}
}
