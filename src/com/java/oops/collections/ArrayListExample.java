package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Iterator;

import com.java.oops.inheritance.Boy;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add(7);
		list.add("Hey");
		list.add(false);
		list.add(new Boy());
		list.add(null);

		System.out.println(list);

		// Features
//		Can contain duplicates
//		Can only contain Objects
//		Rich Fn Library
		// PROS
//		Dynamic [Grow and Shrink]

		list.remove(2);
		System.out.println(list);

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(4);
		numList.add(14);
		numList.add(234);

		numList.add(432);
		numList.add(41);
		numList.add(41);
		
		numList.add(49);
		
		numList.add(14);

		System.out.println(numList);

//		numList.add("");

//		1. Using simple for loop
//		for (int i = 0; i < numList.size(); i++) {
//			numList.add(9);
//			System.out.println(numList.get(i));
//		}

//		2. Using for each loop
		for (Integer num : numList) {
//			numList.add(9);
			System.out.print(num + " ");
		}

//		3. Using Iterator

//		[4, 14, 234, 432, 41, 14]  <-----

		System.out.println();
		Iterator<Integer> itr = numList.iterator();
		while (itr.hasNext()) {
			Integer num = (Integer) itr.next();
			System.out.print(num + " ");

		}
		System.out.println();
//		4. Using Streams
		numList.stream().forEach(System.out::println);
		System.out.println();
		System.out.println();

		numList.forEach(System.out::println);
		System.out.println();
		System.out.println();

		numList.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

	}

}
