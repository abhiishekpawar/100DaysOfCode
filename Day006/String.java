package com.h_daysofcode.src;

public class StringDemo1 {

	public static void main(String[] args) {
		
		//Two ways of creating string object
		String s1 = "Banglore";
		String s2 = "Banglore";
		String s3 = new String("Welcome to Banglore");
		String s4 = new String("Banglore");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//String methods
		String s = "sharathbhairaraju";
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		System.out.println(s.substring(3,15));
		System.out.println(s.contains("bhai"));
		System.out.println(s.replace("a", "$"));
		System.out.println(s.isEmpty());
		
		String a = "abhishek";
		String b = "pawar";
		System.out.println(a == b);//checks address
		System.out.println(a.equals(b));//checks content
		
	}

}
