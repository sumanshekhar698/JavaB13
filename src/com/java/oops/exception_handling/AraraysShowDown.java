package com.java.oops.exception_handling;

import java.util.Scanner;

public class AraraysShowDown {

	public static void main(String[] args) {

		System.out.println("START");
		int[] arr = { 32, 23, 23, 3, 321, 2121, 3 };

		// Checked

		// Unchecked

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
//		try catch
//		try catch catch ...
//		try catch() catch ...
//		+ finally{}

		try {// Risk Lines
			System.out.println(arr[20 / num]);// Unchecked :: No one forcing to handle Exception
//			System.exit(7);//One of the ways to stop finally from execution
			return;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
//		catch (ArithmeticException e) {
//			e.printStackTrace();
//		} 
		catch (Exception e) {
			e.printStackTrace();
		} finally {// this will execute NO MATTER WHAT
			System.out.println("finally!!");
			scanner.close();
		}
//		catch (Throwable e) {
//			e.printStackTrace();
//		}

		System.out.println("END");

	}

}
