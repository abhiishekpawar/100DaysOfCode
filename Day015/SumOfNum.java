package hello.src.load;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int r,temp = n;
		int sum=0;
		
		while(n>0)
		{
			r = n %10;
			sum = sum + r;
			n=n/10;
			
		}
		
		System.out.println(sum);
	}

}
