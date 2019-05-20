package com.semanticsquare.functional;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {
	static int count = 0;

	@Override
	public void run() {
		System.out.println("printing values in child thread");
		for (int i = 0; i < 10; i++) {
			System.out.println("value child= " + i);
		}

	}

	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyRunnable());

		thread.start();

		System.out.println("printing values in Parent thread");
		for (int i = 0; i < 10; i++) {
			System.out.println("value parent= " + i);
		}
		final List<Integer> list = new ArrayList<>();
		int count2 = 0;
		new Thread(()-> {
			for (int i = 0; i < 10; i++) {
				System.out.println("value of cont local is "+count2);
				System.out.println("value of cont is "+count);
				list.add(count);
				count++;
			}
		}
		).start();;
		
	}
	
	

}
