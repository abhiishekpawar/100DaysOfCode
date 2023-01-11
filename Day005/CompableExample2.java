package com.h_daysofcode.src;

public class ComparableEx2 implements Comparable<ComparableEx2> {
	String ename;
	int id;
	
	ComparableEx2(String ename, int id)
	{
		this.ename = ename;
		this.id = id;
	}

	@Override
	public String toString() {
		return this.ename+"="+this.id;
	}
	
	public int compareTo(ComparableEx2 x)
	{
		Integer i = this.id;
		return i.compareTo(x.id);
		
		
	}
	

}
