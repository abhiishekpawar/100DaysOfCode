package com.h_daysofcode.src;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		
		sb.append(" Abhishek");//append at the end
		System.out.println(sb);//Hello Abhishek
		
		sb.insert(0, "Hi ");
		System.out.println(sb);//Hi Hello Abhishek
		
		int n = sb.indexOf("A");
		System.out.println(n);
		
		sb.replace(9, 17, "Pawar");
		System.out.println(sb);//Hi Hello Pawar
		
		sb.delete(0,3);
		System.out.println(sb);//Hello Pawar
		
		sb.reverse();
		System.out.println(sb);
	}

}
