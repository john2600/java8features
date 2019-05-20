package com.doublecolon.example;

public class MyClass {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};

		Thread t = new Thread(r);
		Thread t2 = new Thread(new OtherClass());
		try {
			
			t.join();
			t2.join();
		} catch (InterruptedException e) {

		}
		t.start();
		t2.start();

	}

}
