package hello.src.load;

import java.util.Scanner;

public class tables {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int res=1;
		for(int i=1; i<11;i++)
		{
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}

}
