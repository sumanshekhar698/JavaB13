package com.java.oops.exception_handling;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 32, 23, 23, 3, 321, 2121, 3 };

		// Checked

		// Unchecked

//		try catch
//		try catch catch ...
//		try catch() catch ...
//		try with resource
//		+ finally{}

		try (Scanner scanner = new Scanner(System.in);) {// try with resource [should be a child of AutoCloseable]
			int num = scanner.nextInt();
			System.out.println(arr[20 / num]);// Unchecked :: No one forcing to handle Exception
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally!!");
		}
		System.out.println("END");

	}

}
