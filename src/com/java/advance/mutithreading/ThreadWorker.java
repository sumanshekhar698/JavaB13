package com.java.advance.mutithreading;

public class ThreadWorker extends Thread {

	@Override
	public void run() {//Work
		for (int i = 0; i < 8; i++) {
			try {
				Thread.sleep(500);
				System.out.println("" + i + Thread.currentThread());//Thread-0,5,main
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
