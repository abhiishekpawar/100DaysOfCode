package hello.src.load;

import java.util.*;
import java.util.Map.Entry;


public class SortHashMapKeys {
	public static void main(String[] args) {
		Map<Integer,Character> map = new HashMap<>();
		map.put(9,'A');
		map.put(4,'F');
		map.put(8,'O');
		map.put(7,'B');
		map.put(10,'T');
		map.put(112,'U');
	
		for(Map.Entry<Integer, Character> entry:map.entrySet()) {
			System.out.print(entry.getKey()+" ");
		}
		System.out.println();
		
		Map<Integer,Character> treemap = new TreeMap<>(map);
		for(Entry<Integer, Character> entry:treemap.entrySet()) {
			System.out.print(entry.getKey()+" ");
		}
	}

}
