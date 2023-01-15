package hello.src.load;

import java.util.*;

public class Anagarm2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean res = Arrays.equals(ch1, ch2);
		System.out.println(res);
		
		}
		
	}


