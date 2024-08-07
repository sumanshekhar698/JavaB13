package com.java.oops.static_concept;

public class Employe {

	final String name;//final with instance variable
	String id;
	static private int counter = 0;

	public Employe(String name, String id) {
		this.name = name;
		this.id = id;
		++counter;
	}

	public Employe(String name) {
		++counter;
		this.name = name;
		this.id = "EMP" + counter;
		
	}

}
