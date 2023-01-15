package hello.src.load;

import java.util.*;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String unique = "";

		char[] arr = input.toCharArray();
		
		Set<Character> set = new LinkedHashSet<>();
		for(char ch:arr) {
			if(!set.contains(ch)) {
				set.add(ch);
			}
		}
		Iterator<Character> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}

}
