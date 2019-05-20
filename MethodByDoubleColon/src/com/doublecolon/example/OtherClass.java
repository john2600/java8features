package com.doublecolon.example;

public class OtherClass implements Runnable {

	@Override
	public void run() {
		int count = 0;
		synchronized (this) {
			while (count < 10) {
				System.out.println("hello wordl");
				count++;
			}	
		}
		
	}

	public static void m2() {
		
	}
}
