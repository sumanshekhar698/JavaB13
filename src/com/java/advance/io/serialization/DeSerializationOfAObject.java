package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.java.advance.io.FilePaths;

public class DeSerializationOfAObject {

	public static void main(String[] args) {
	
		File file = new File(FilePaths.PATH_OF_SERIAL_FILE);

		if (file.exists()) {

			try (FileInputStream fis = new FileInputStream(file);
					ObjectInputStream ois = new ObjectInputStream(fis);) {
				
				Student st = (Student)ois.readObject();
				System.out.println(st);
				
				
				

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("Invalid File");
		}

	}
}
