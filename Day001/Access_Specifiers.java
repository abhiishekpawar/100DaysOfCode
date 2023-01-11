import java.util.*;

public class Mock {
	int b = 20;
	protected int c = 30;
	public int d = 40;
	private int a  =10;
	
	public void method() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Mock m = new Mock();
		System.out.println(m.a);
		System.out.println(m.b);
		System.out.println(m.c);
		System.out.println(m.d);
		
	}
}


/*
Access Modifier 	within class	within package	outside package by subclass only	outside package

Private             	Y	                N	        N	                                N
Default	                Y	                Y           	N                               	N
Protected	        Y       	        Y           	Y                               	N
Public	                Y	                Y           	Y	                                Y
*/
