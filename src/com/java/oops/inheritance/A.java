package com.java.oops.inheritance;

public class A {

	int a = 9;
	private int x = 100;// private instance var/fn are not inherited

	public static void main(String[] args) {
		C c = new C();
		c.foo();
		
		E e = new E();
		e.foo();
	}

	void foo() {
		System.out.println("A");
		System.out.println(a);// 11
//		System.out.println(b);
	}
}

class B extends A {

	int a = 10;

	void foo() {
		System.out.println("B");
		System.out.println(a);// 11
		System.out.println(super.a);// 11

//		System.out.println(b);
	}

	final void bar() {// final fn are not overridedd
		System.out.println("B");
	}

}

class E extends B{
	
}

final class C extends B {

	int a = 11;
	int b = 0;

	@Override
	void foo() {// In Runtime [ Runtime Polymorphism]
//		System.out.println(x);
//		super.foo();
		System.out.println("C");
		System.out.println(a);// 11
		System.out.println(super.a);// 11

//		System.out.println(b);
	}

//	@Override
//	void bar() {
//		System.out.println("C");
//		;
//	}

}

/*
 * class D extends C {//final classes cannot be inherited
 * 
 * }
 */