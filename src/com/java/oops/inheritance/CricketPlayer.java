package com.java.oops.inheritance;

public class CricketPlayer extends Player {

	int jerseyNumber;
	boolean isAllrounder;
	int runs;
	int wickets;

	
	public CricketPlayer(String name, int age, Gender gender, int jerseyNumber, boolean isAllrounder, int runs,
			int wickets) {

		super(name, age, gender);//super means immediate parent
		System.out.println("CricketPlayer()");
		this.jerseyNumber = jerseyNumber;
		this.isAllrounder = isAllrounder;
		this.runs = runs;
		this.wickets = wickets;
	}

	

	
	public String toString() {
		return "CricketPlayer [jerseyNumber=" + jerseyNumber + ", isAllrounder=" + isAllrounder + ", runs=" + runs
				+ ", wickets=" + wickets + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	

}
