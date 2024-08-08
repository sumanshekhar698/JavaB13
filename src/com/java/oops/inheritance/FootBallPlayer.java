package com.java.oops.inheritance;

public class FootBallPlayer extends Player{
	
	int goals;
	boolean isGoalKeeper;
	
	
	public FootBallPlayer(String name, int age, Gender gender, int goals, boolean isGoalKeeper) {
		super(name, age, gender);
		this.goals = goals;
		this.isGoalKeeper = isGoalKeeper;
	}


	@Override
	public String toString() {
		return "FootBallPlayer [goals=" + goals + ", isGoalKeeper=" + isGoalKeeper + "]";
	}
	
	
	

}
