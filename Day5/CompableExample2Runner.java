package com.h_daysofcode.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<ComparableEx2> list = new ArrayList<>();
		ComparableEx2 c1 = new ComparableEx2("abhi",101);
		ComparableEx2 c2 = new ComparableEx2("pawar",103);
		ComparableEx2 c3 = new ComparableEx2("rohit",98);
		ComparableEx2 c4 = new ComparableEx2("virat",181);
		ComparableEx2 c5= new ComparableEx2("rahul",77);
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		
		System.out.println(list);
		System.out.println("After sorting");
		Collections.sort(list);
		System.out.println(list);
	}

}
