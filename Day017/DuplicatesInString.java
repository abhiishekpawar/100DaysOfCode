package hello.src.load;

import java.util.Scanner;

public class DuplicatesInString {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String in = sc.next();
		String newStr = "";
		String uni = "";
		
		for(int i=0;i<in.length(); i++)
		{
			char ch  = in.charAt(i);
			if(newStr.indexOf(ch) == -1) {
				newStr+= ch;
			}else {
				uni+=ch;
			}
		}
		System.out.println(uni);
	}

}
