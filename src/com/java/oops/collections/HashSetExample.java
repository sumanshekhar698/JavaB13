package com.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSetExample {

	public static void main(String[] args) {

		List<Integer> list0 = List.of(32, 4, 423, 43432, 234, 42, 423, 423, 42, 42423, 32, 2, 2, 2, 23);// Immutable

		ArrayList<Integer> list = new ArrayList<Integer>() {
			{
				add(5);
				add(89);
				add(567);
				add(2);
				add(5);
				add(897);
			}
		};

		Collections.sort(list);//n logn + n
		System.out.println(list);
		
		
		
		HashSet<Integer> set = new HashSet<Integer>();//not contain any duplicates
		for (Integer num : list) {//n
			set.add(num);
		}

		System.out.println(set);
		
		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();//not contain any duplicates
		for (Integer num : list) {//TODO
			set2.add(num);
		}

		System.out.println(set2);
		
		boolean contains = set2.contains(567);//O[1] + n
		System.out.println(contains);
		
		
	}

}
