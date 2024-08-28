package com.java.advance.mutithreading;

public class Intro {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread());//Thread[#1,main,5,main]  
//		main,5,main :: thread name,priority,parent thread
		
//		for (int i = 0; i < 8; i++) {
//			Thread.sleep(500);
//			System.out.println(i);
//			
//		}
//		System.out.println(Thread.currentThread());
		
		
		//Thread Scheduler OS level
		ThreadWorker t0 = new ThreadWorker();//Worker
		t0.setName("t0");
		t0.start();
		
		ThreadWorker t1 = new ThreadWorker();
		t1.start();
		t1.setName("t1");
		t1.setPriority(10);//1 - 10  [5]
		
		ThreadWorker t2 = new ThreadWorker();
		t2.start();//OS/Priority/On other running task
		t2.setName("t2");
		
		Thread t3 = new Thread(new Work());
		t3.start();
		
		System.out.println("FINISH!!");

	}

}
