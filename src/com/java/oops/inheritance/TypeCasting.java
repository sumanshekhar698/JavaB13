package com.java.oops.inheritance;

public class TypeCasting {

	public static void main(String[] args) {
		
//		int mo = 88;
//		boolean mb =(boolean) mo;
		

		Child child = new Child();
		child.foo();
		child.bar();
		int z = child.z;
		System.out.println(z);

		Parent p = child;// UPCASTING -Implicit
//		p.z;

		Parent p1 = new Child();//

		// Downcasting is to be done with caution

//		p1.z

		Parent p2 = new Parent();
		if (p2 instanceof Child) {
			Child c1 = (Child) p2;
		}

		if (p1 instanceof Parent) {
			Child c2 = (Child) p1;
			System.out.println(c2.z);
		}

	}

}

class Parent {

	int x = 9;
	int y = 10;
	int a = 99;

	void foo() {
		System.out.println("Parent");
	}

}

class Child extends Parent {
	int x = -9;
	int y = -10;
	int z = -11;

	@Override
	void foo() {
		System.out.println("Child");
	}

	void bar() {
		System.out.println("Child Bar");
	}
}
