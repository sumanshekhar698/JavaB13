package com.java.oops.inheritance;

public class Main {

	public static void main(String[] args) {
		CricketPlayer vk = new CricketPlayer("Virat Kohli", 52, Gender.MALE, 18, false, 25000, 1);
		System.out.println(vk);

	}

}

//Rules
/*
 * A class can have only 1 immediate parent 
 * Multiple Inheritance is not allowed
 * Multi Level Inheritance is allowed
 */
