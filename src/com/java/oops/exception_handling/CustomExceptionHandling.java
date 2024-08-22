package com.java.oops.exception_handling;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("Enter you AGE: ");
			int age = scanner.nextInt();
			isEligibleForVoting(age);
		} catch (IllegalVotingAge e) {
			e.printStackTrace();
		}

	}

	private static void isEligibleForVoting(int age) throws IllegalVotingAge {
		if (age < 0 || age > 150) {
			throw new IllegalVotingAge("Invalid AGE");

		} else if (age < 18) {
			throw new IllegalVotingAge("Under AGE");
		} else {
			System.out.println("Voting Eligible");
		}

	}

}

class IllegalVotingAge extends Exception {// 1: make the class a child of Exception

	public IllegalVotingAge(String message) {// 2: call the Parent constructor of your choice
		super(message);
	}

}
