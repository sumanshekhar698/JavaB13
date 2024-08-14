package com.java.oops.abstraction.interfaces.special;

public class Main {

	public static void main(String[] args) {
		Tejas tejas = new Tejas();
		tejas.fly();
		tejas.flyingAtHeight();
		FighterJet.fight();

		FighterJet jet2 = new FighterJet() {
			float maxSpeedInMach = 2.2f;

			@Override
			public int flyingAtHeight() {
				// TODO Auto-generated method stub
				return 0;
			}
		};

		// Functional Interface | Lambda fn
		FighterJet jet3 = () -> {
			System.out.println("Flying at Height " + 55000 + " ft");
			return 55000;

		};

		jet3.flyingAtHeight();

	}

}

class Tejas extends Imported implements FighterJet, MadeInIndia {// A class can extends another class and
//	implement a Multiple Interfaces

	@Override
	public int flyingAtHeight() {
		System.out.println("Flying at Height " + MAX_CEILING_HEIGHT_IN_FT + " ft");
		return MAX_CEILING_HEIGHT_IN_FT;
	}

}

class Imported{
	
}

interface MadeInIndia extends Plane, Carrier {// An interface can also extends on ore more interfaces

}

interface Plane {

}

interface Carrier {

}
