package com.java.advance.mutithreading;

public class PrimeMinister {// Singleton Pattern

	final private String name;
	final private int age;
	private static PrimeMinister pm;
	
	

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private PrimeMinister(String name, int age) {
		this.name = name;
		this.age = age;

	}

	//synchronized on methods :: only 1 thread can access at a time
	 static synchronized PrimeMinister electPm(String name, int age) {//Mt this may fail

		if (pm == null) {
			pm = new PrimeMinister(name, age);
		}

		return pm;
	}

}
