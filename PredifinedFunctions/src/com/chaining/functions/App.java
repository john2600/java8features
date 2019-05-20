package com.chaining.functions;

import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		Function<String, String> f1 = i -> i.toUpperCase();
		Function<String, String> f2 = i -> i.substring(0, 9);

		System.out.println(f1.apply("asdfasdfasdfasd"));
		System.out.println(f2.apply("asdfasdfasdfasd"));

		System.out.println(f1.andThen(f2).apply("afasdfasdfasd"));

		System.out.println(f1.compose(f2).apply("afasdfasdfasd"));

		Function<Integer, Integer> f3 = i -> i + i;
		Function<Integer, Integer> f4 = i -> i * i * i;

		System.out.println(f3.andThen(f4).apply("afasdfasdfasd".length()));

		System.out.println(f3.compose(f4).apply("afasdfasdfasd".length()));
	}
}
