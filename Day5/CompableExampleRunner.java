package com.h_daysofcode.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Example_Runner {

	public static void main(String[] args) {
		Comparable_Example c1 = new Comparable_Example("Abhishek",80.00);
		Comparable_Example c2 = new Comparable_Example("Pawar",90.90);
		Comparable_Example c3 = new Comparable_Example("rohit",50.79);
		Comparable_Example c4 = new Comparable_Example("kohli",34.00);
		Comparable_Example c5 = new Comparable_Example("rahul",30.00);
		
		List<Comparable_Example> list = new ArrayList<>();
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
