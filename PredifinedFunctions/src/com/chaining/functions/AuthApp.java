package com.chaining.functions;

import java.util.Scanner;
import java.util.function.Function;

public class AuthApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("enter user");
		String user = in.nextLine();

		System.out.println("enter password");
		String password = in.nextLine();

		Function<String, String> f1 = i -> i.substring(0, 4);
		Function<String, String> f2 = i -> i.toLowerCase();

		System.out.println(f1.andThen(f2).apply(user));
		if (f1.andThen(f2).apply(user).equals("john") && password.equals("pass")) {
			System.out.println("user valid");
		} else {
			System.out.println("user not valid");
		}

	}
}
