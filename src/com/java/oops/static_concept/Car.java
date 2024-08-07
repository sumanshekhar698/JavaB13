package com.java.oops.static_concept;

public class Car {

	String company;// 3 instance var
	String model;
	float avgSpeed;
	static String color = "Cherry Red";// 1 static var

	{
		System.out.println(" 1");

	}
	static {// static things execute even before object creation
		color = "Jet Black";
//		model = "Velfire"; //non static things cannot be accessed from static context BUT vice versa is not true
		System.out.println("static 1");
	}

	static {// static things execute even before object creation
		color = "Jet Black";
//		model = "Velfire"; //non static things cannot be accessed from static context BUT vice versa is not true
		System.out.println("static 2");

	}

	{
		System.out.println(" 2");

	}

	{
		System.out.println(" 3");

	}

	public Car(String company, String model, float avgSpeed, String color) {
		System.out.println("Constuctor called");
		this.company = company;
		this.model = model;
		this.avgSpeed = avgSpeed;
		Car.color = color;
	}

	static public String sayMyColor() {
		return "Car [color=" + color;
	}

}
