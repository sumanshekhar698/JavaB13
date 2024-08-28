package com.java.advance.mutithreading;

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");
		System.out.println(Thread.currentThread() + "" + Thread.currentThread().getState());
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 8; i++) {
				try {
					Thread.sleep(500);
					System.out.println("" + i + Thread.currentThread());// Thread-0,5,main
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			System.out.println(Thread.currentThread() + "" + Thread.currentThread().getState());
		});
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());

		t1.join();
		System.out.println(t1.getState());
		System.out.println("FINISH!!");
		System.out.println(t1.getState());
		System.out.println(Thread.currentThread() + "" + Thread.currentThread().getState());
	}

}
