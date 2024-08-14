package com.java.oops.inheritance;

public class StaticInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		M m = new M();
		m.foo();
		
		M.foo();
		P.foo();

	}

}

class P {

	static void foo() {
		System.out.println("P");
	}

}

class M extends P {

//	@Override static fn cannot be overriden
	static void foo() {//Method/fn Hiding
		System.out.println("M");
	}
}
