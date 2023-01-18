package hello.src.load;

import java.util.*;

public class test {
	
	public static void main(String[] args) {
		int[] arr = {12,34,2,23,34,120,23};
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
		
		}
		
	}

