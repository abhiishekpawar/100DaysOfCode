//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


//Input: nums = [1,2,3,4]
	//	Output: [24,12,8,6]


package hello.src.load;

import java.util.*;
import java.sql.*;

public class test {
	public static void main(String[] args) {
		int res = 1;
		int[] arr = {1,2,3,4};
		for(int i=0;i<arr.length; i++)
		{
			res = res*arr[i];
		
		}
		int[] nums = new int[arr.length];
		
		for(int j=0;j<arr.length;j++)
		{
			nums[j] = res/arr[j];
		}
		
		for(int y:nums)
			System.out.print(y+" ");
		
	}
}
