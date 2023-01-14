package hello.src.load;

import java.util.*;

/*
 abc ---->op is abc and length is 3
 abcabac ---> op is abc and length is 3
 
 */

public class Longest_substring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		HashSet<Character> set = new HashSet<>();
		String longestTillNow = "";
		String overAllLongest = "";

		for (int i = 0; i < in.length(); i++) {
			char ch = in.charAt(i);
			if (set.contains(ch)) {
				longestTillNow = "";
				set.clear();
			}
			set.add(ch);
			longestTillNow += ch;
			
			if(longestTillNow.length() > overAllLongest.length()){
				overAllLongest = longestTillNow;
			}

		}
		
		System.out.println(overAllLongest);

	}

}