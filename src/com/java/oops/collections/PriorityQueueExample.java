package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();//Min Heap

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());//Max Heap
		pq.add(4);// log n
		pq.add(43);
		pq.add(13);
		pq.add(23);
		pq.add(-3);
		pq.add(13);
		pq.add(83);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);


	}

}
