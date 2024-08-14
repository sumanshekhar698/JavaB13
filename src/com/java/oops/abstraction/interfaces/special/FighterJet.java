package com.java.oops.abstraction.interfaces.special;

@FunctionalInterface
public interface FighterJet {

	int MAX_CEILING_HEIGHT_IN_FT = 55000;

//	int flyingAtSpeed();//Abstract method

	int flyingAtHeight();// Abstract method

	// JDK 8+
	static void fight() {// static methods are allowed in the interfaces | concrete method
		System.out.println("Fightttt");

	}

	default void fly() {// default methods are allowed in the interfaces | concrete method
		System.out.println("Jets fly high");

	}

}
