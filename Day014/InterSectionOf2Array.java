package hello.src.load;

import java.util.*;

public class InterSectionOf2Array {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4};
		int[] arr2 = {5,4,7,8};
		Set<Integer> set = new HashSet<>();
		for(int i:arr1) {
			set.add(i);
		}
		
		for(int j:arr2) {
			if(set.contains(j)) {
				System.out.println(j);
			}else {
				set.add(j);
			}
		}
		
	}

}
