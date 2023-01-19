package hello.src.load;

import java.util.Scanner;

public class hackerkank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		String temp = "";
		String rep = "";
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i] == '0') {
				temp += ch[i];
			}
			if(ch[i] == '1') {
				rep += 'a';
			}else if(ch[i] == '2') {
				rep += 'b';
			}
		}
		
		String res = rep+temp;
		System.out.println(res);
	}

}
