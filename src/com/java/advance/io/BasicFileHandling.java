package com.java.advance.io;

import java.io.File;

public class BasicFileHandling {

	public static void main(String[] args) {

		File file = new File(FilePaths.INVALID_PATH);

		if (file.exists()) {

			System.out.println("is Folder " + file.isDirectory());
			System.out.println("is File " + file.isFile());

			System.out.println("hidden ? " + file.isHidden());

			System.out.println("path " + file.getAbsolutePath());

			// R W E
			System.out.println("R " + file.canRead());
			System.out.println("W " + file.canWrite());
			System.out.println("E " + file.canExecute());
		} else {
			System.out.println("Invalid File");
		}

	}

}
