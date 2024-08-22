package com.java.oops.exception_handling;

public class Main {

	static int counter = 0;

	public static void main(String[] args) {

		System.out.println("START");
		callMe();

		System.out.println("END");

	}

	static void callMe() {
		System.out.println("Calling ..... " + ++counter + " time");
		
		callMe();

	}

}
