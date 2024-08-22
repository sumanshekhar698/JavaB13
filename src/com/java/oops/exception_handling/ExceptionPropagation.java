package com.java.oops.exception_handling;

public class ExceptionPropagation {

//	public static void main(String[] args) throws InterruptedException {//DEH
	public static void main(String[] args) {// DEH

		try {
			call1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void call1() throws InterruptedException {
		System.out.println("calling 1");

		call2();

	}

	private static void call2() throws InterruptedException {
		System.out.println("calling 2");

		call3();

	}

	private static void call3() throws InterruptedException {
		System.out.println("calling 3");
		call4();

	}

	private static void call4() throws InterruptedException {
		System.out.println("calling 4");
//		System.out.println(9/0);
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			Thread.sleep(500);

		}

	}

}
