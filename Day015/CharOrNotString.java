package hello.src.load;

import java.util.Scanner;

public class CharOrNotString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		for(int  i=0;i<in.length(); i++)
		{
			char ch= in.charAt(i);
			if( (ch>='a' && ch<='z')||(ch>='A' && ch<='Z') ) {
				continue;
			}else {
				System.out.println(ch);
			}
		}
	}

}
