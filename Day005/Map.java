package com.h_daysofcode.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "Rohit");
		mp.put(2, "Rahul");
		mp.put(3, "Virat");
		mp.put(4, "Sky");
		mp.put(null, "Hardik");
		mp.put(5, null);
		
		System.out.println(mp);
		System.out.println(mp.containsKey(4)); // checks specified key is present or not
		System.out.println(mp.containsValue("Virat"));  // checks specified value is present or not
		System.out.println(mp.get(4));
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		//Iterating map(loops not valid)
		//get all the keys and store in set then iterate
		Set<Integer> allKeys = mp.keySet();
		for (Integer i : allKeys) {
			String val = mp.get(i);
			System.out.print(i +"="+val+" ");
		}
		
	}
}
