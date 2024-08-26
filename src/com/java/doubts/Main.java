package com.java.doubts;

class FighterJet {

	String name;
	float topSpeedInMach; // private : only access with in the class
	int celingHeight; // default
	boolean isMultiRole; // default

	FighterJet(String name, float topSpeedInMach, int celingHeight, boolean isMultiRole) {
		this.name = name;
		this.topSpeedInMach = topSpeedInMach;
		this.celingHeight = celingHeight;
		this.isMultiRole = isMultiRole;
	}

	private void foo() {
		System.out.println("Testing jet ");

	}

	public void bar() {
		System.out.println("Testing end ");
	}

	public static void main(String[] args) {
		FighterJet refale = new FighterJet("Refale", 1.8f, 48000, true);
		System.out.println(refale.topSpeedInMach);
	}
}

public class Main {
	
	
	
	public static void main (String[] args) {
		
		 FighterJet refale = new FighterJet("Refale" , 1.8f , 48000 , true);
		 System.out.println(refale.topSpeedInMach);
		 refale.topSpeedInMach = 0;
		 System.out.println( refale.topSpeedInMach);
	}
		 
}