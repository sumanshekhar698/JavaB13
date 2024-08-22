package com.java.oops.collections;

import java.util.HashMap;
import java.util.List;

public class FreqTable {

	public static void main(String[] args) {
		List<Integer> list0 = List.of(32, 4, 423, 43432, 234, 42, 423, 423, 42, 42423, 32, 2, 2, 2, 23);// Immutable

		HashMap<Integer, Integer> map = new HashMap();

		for (Integer num : list0) {
//			if (map.containsKey(num)) {
//				map.put(num, map.get(num) + 1);
//			}else {
//				map.put(num, 1);
//			}

			map.put(num, map.getOrDefault(num, 0) + 1);

		}

		System.out.println(map);

	}

}//Sorting
