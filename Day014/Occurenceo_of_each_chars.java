package hello.src.load;

import java.util.*;

public class Occurenceo_of_each_chars {

	public static void main(String[] args) {
		String in = "abhishek";
		HashMap<Character,Integer> map = new HashMap<>();
		char ch;
		int count = 0;
		for(int i=0; i<in.length();i++)
		{
			ch = in.charAt(i);
			if(map.containsKey(ch)) {
				count = map.get(ch);
				count++;
				map.replace(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = new HashSet<>();
		for(Character key:map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
