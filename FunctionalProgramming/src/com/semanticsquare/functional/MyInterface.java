package com.semanticsquare.functional;

@FunctionalInterface
public interface MyInterface {
	public void myMethod();
	

	public static void m1() {

	}

	public default void m2() {

	}

	public default void myMethod2() {
		System.out.println("john");
	}

	public default void m3() {

	}
}
