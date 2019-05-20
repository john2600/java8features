package com.semanticsquare.functional;

public class ThreadWithLambda {
	public static void main(String[] args) {
		Runnable r = () -> { for (int i = 0; i < 10; i++) {
				System.out.println("print value");
		}};
		
		Thread thread = new Thread(r);
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("print parent");
		}
	}
}
