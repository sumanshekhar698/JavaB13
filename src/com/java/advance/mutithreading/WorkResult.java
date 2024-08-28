package com.java.advance.mutithreading;

import java.util.concurrent.Callable;

public class WorkResult implements Callable<Integer> {//Work

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			try {
				Thread.sleep(500);
				sum+=i;
				System.out.println("" + i + Thread.currentThread());//Thread-0,5,main
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		return sum;
	}

}
