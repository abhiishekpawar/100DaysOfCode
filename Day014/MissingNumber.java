package hello.src.load;

import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] arr = {2,4,1,5,7,8,9};
		HashSet<Integer> set = new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		
		for(int i=1; i<arr.length;i++)
		{
			if(!set.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
