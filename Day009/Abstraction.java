package com.h_daysofcode.src;

abstract class KeyBoard{
	void pressP() {
		System.out.println(" p is pressed");
	}
	
	void pressQ() {
		System.out.println("Q is pressed");
	}
	
	abstract void pressEnter();
}

class MusicPlayer extends KeyBoard{

	@Override
	void pressEnter() {
		System.out.println("Music is about to start");
		
	}
	
}

public class Mock1 {
	public static void main(String[] args) {
		KeyBoard k = new MusicPlayer();
		k.pressEnter();
		k.pressP();
		k.pressQ();
	}
}
