package hello.src.load;

import java.util.*;

public class PrintDuplicateString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Set<Character> set = new HashSet<>();
		int count=1;
		for(int i=0;i<input.length(); i++)
		{
			char ch = input.charAt(i);
			if(set.contains(ch)) {
				count+=1;
			}else {
				set.add(ch);
			}
			if(count>1) {
				System.out.println(ch+" "+count);
				count=0;
			}
		}
		
	}

}
