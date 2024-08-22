package com.java.oops.collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

//		MAP
//		K:V

		
//		<K:V>   Entry
		HashMap<Integer, String> map = new HashMap<>();//K:V  Keys are unique
		map.put(3, "Jane");
		map.put(6, "John");
		map.put(13, "Tim");
		System.out.println(map);

		map.put(3, "Monty");
		
		System.out.println(map);
		
		String val = map.get(6);//Constant Time O(1) + n
		System.out.println(val);
		
		map.remove(3);
		
		System.out.println(map);

//		Iterate
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
			
		}
		
		boolean containsKey = map.containsKey(787);//Constant Time O(1) + n
		System.out.println(containsKey);

	}

}
