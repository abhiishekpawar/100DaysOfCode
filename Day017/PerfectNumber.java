package hello.src.load;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		for(int i=1; i<n;i++)
		{
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum== temp) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
