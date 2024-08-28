package com.java.assingment.elevator;

import java.util.Scanner;

public class ElevatorChallenge {

	static void automaticElevator() throws InterruptedException {
		Elevator elevator = new Elevator();
		elevator.lunchtimeElevatorRush();
		elevator.start();
	}

	static void manualElevator() throws InterruptedException {
		Elevator elevator = new Elevator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a starting floor 0 - 10");
		int start = sc.nextInt();
		System.out.println("Enter a destination floor 0 - 10");
		int end = sc.nextInt();
		elevator.callElevator(start, end);// calling the elevator to pick us up
		elevator.start();
		sc.close();
	}

	public static void main(String[] args) throws InterruptedException {
		manualElevator();
//		automaticElevator();
	}
}