package com.java.oops.exception_handling;

public class CheckedExceptions {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);//checked exception code
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // 0.5s
			System.out.println(i);
		}

	}
}
