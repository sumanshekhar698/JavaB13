package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {

		
		List<Integer> list1 = List.of(3,4,4,23,23,2332,32,3);
		ArrayList<Integer> numList = new ArrayList<Integer>();
		System.out.println(numList.isEmpty());

		numList.add(4);
		numList.add(14);
		numList.add(234);

		numList.add(432);
		numList.add(41);
		numList.add(41);
		
		numList.add(49);
		
		numList.add(14);

		System.out.println(numList);
		
		System.out.println(numList.contains(31));
		System.out.println(numList.isEmpty());
//		System.out.println(numList.getFirst());
//		System.out.println(numList.getLast());
		
		numList.addAll(list1);
		System.out.println(numList);

		//
		Collections.sort(numList);
		System.out.println(numList);

		Collections.shuffle(numList);
		System.out.println(numList);

		
		Collections.sort(numList, Collections.reverseOrder());
		System.out.println(numList);
		
		
		Collections.sort(numList);
		System.out.println(numList);
		
		Collections.reverse(numList);
		System.out.println(numList);


	}

}
