package com.h_daysofcode.src;

public class Comparable_Example implements Comparable<Comparable_Example> {
	String name;
	double perc;
	public Comparable_Example(String name, double perc) {
		super();
		this.name = name;
		this.perc = perc;
	}
	
	void study() {
		System.out.println("studying");
	}

	@Override
	public String toString() {
		return this.name+"="+this.perc;
	}
	
	//sort based on perc in ascending order
	@Override
	public int compareTo(Comparable_Example cc)
	{
		Double d = this.perc;
		return d.compareTo(cc.perc); //if we want in descending  multiplay by -1 d.compareTo(cc.perc)*-1
	}
	
	

}
