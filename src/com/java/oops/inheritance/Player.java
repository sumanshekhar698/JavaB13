package com.java.oops.inheritance;

public class Player {
	String name;
	int age;
	Gender gender;
	
	
	public Player(String name, int age, Gender gender) {
		System.out.println("Player()");

		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	

}
