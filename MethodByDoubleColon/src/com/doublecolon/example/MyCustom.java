package com.doublecolon.example;

public class MyCustom {
	
	public void m1() {
		for (int i = 0; i <10; i++) {
			System.out.println("Hello wordl");
		}
	}
	
	public static void main(String[] args) {
		MyCustom my = new MyCustom();
		
		Runnable r = my::m1;
		
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
	}
	
}
