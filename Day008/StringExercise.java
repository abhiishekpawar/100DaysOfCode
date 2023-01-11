// Q1) Reverse the string ?
public class Mock1 {

	public static void main(String[] args) {
		String name = "Abhishek";
		String res ="";
		for(int i=name.length()-1; i>=0; i--)
		{
			res += name.charAt(i);
		}
		System.out.println(res);
		
		//another method
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());
	}
	
}

//  Q2)Remove the special characters from the given string
public class Mock1 {

	public static void main(String[] args) {
		String s = "$ja!va$&st%ar";  //javastar
		
		
		//method 1
		String res = s.replaceAll("[^a-zA-Z0-9]", "");   // ^ --> this symbol acts as except
		System.out.println(res);
		
		
		//method 2
		String temp = "";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>64 &&  s.charAt(i)<=121)
			{
				temp += s.charAt(i);
			}
		}
		
		System.out.println(temp);
	}
	
}
//Q3) Remove the white spaces from the given string

public class Mock1 {

	public static void main(String[] args) {
		String name = "                 j a   va   st  a r";
		
		//METHOD 1
		String res = "";
		for(int i=0; i<name.length(); i++)
		{
			if(name.charAt(i)!=' ')
			{
				res += name.charAt(i);
			}
		}
		
		System.out.println(res);
		
		
		//METHOID 2
		String x=name.trim(); // it will remove begining and ending spaces from the string
		System.out.println(x);
		
		//METHOD3
		
		String s3 = name.replaceAll(" ", "");  //uses regex euqation
		System.out.println(s3);
		
		
	}
	
}

//Q4)Remove Duplicate character from the string
package com.h_daysofcode.src;

import java.util.LinkedHashSet;
import java.util.Set;

public class Mock1 {

	public static void main(String[] args) {
		String name = "programming";
		
		//Method1
		StringBuilder sb1 = new StringBuilder();
		name.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
		//method 2
		StringBuilder sb2 = new StringBuilder();
		for(int i=0 ;i<name.length(); i++)
		{
			char ch = name.charAt(i);
			int idx = name.indexOf(ch, i+1);
			if(idx == -1)
			{
				sb2.append(ch);
			}
		}
		
		System.out.println(sb2);
		
		//Method 3
		StringBuilder sb3 = new StringBuilder();
		boolean res = false;
		String disc = "";
		String comm = "";
		char[] ch = name.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			res = false;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i] == ch[j]) {
					res = true;
					break;
				}
			}
			if(!res) {
				sb3.append(ch[i]);
			}
		}
		
		System.out.println(sb3);
		
		
		
		//Method4
		
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<name.length();i++)
		{
			set.add(name.charAt(i));
		}
		
		for(Character c:set)
		{
			sb4.append(c);
		}
		
		System.out.println(sb4);
	}
	
}

