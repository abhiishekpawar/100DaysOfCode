
//Class Loading can be done by 2 method ,first one common an 2nd one by using forNmae() method

package com.h_daysofcode.src;

public class ClassLoadingDemo {
	static {
		System.out.println("This is a Static block");
	}

}




package com.h_daysofcode.src;

public class FarnameTestDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.h_daysofcode.src.ClassLoadingDemo");   //com.h_daysofcode.src.ClassLoadingDemo this is qualified class Name,
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
