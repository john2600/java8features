package com.argumentdoublecolon.example;

public class MyClass {

	public MyClass() {
		System.out.println("Creating the Myclass");
	}

	public void m1() {
		System.out.println("My method..");
	}

	public static void main(String[] args) {
		MyInter i = () -> {
			MyClass l = new MyClass();
			return l;
		};

		MyClass myIn = i.get();

		myIn.m1();

		MyInter i2 = MyClass::new;
		MyClass e = i2.get();
		e.m1();
	}
}
