package com.java.advance.mutithreading;

public class VisiblityProblem {

	static volatile boolean flag = true;

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			while (flag) {
				System.out.println("Stop me if you can !!!");
			}
		});

		Thread t2 = new Thread(() -> {
			flag = false;
		});
		
		t1.start();
		t2.start();

	}

}
