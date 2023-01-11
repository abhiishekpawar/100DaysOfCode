package com.h_daysofcode.src;

public class Equaldiff {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s3 = "hello";
		String s4 = "hello";
		System.out.println(s3 == s4); // true : because reference is same

	}

}
