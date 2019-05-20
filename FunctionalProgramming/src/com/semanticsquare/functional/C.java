package com.semanticsquare.functional;

@FunctionalInterface
public interface C {
	public void m1();
}

@FunctionalInterface
interface A {
	public void m2();
}

@FunctionalInterface
interface B extends A {
	
	public void m2();
}

@FunctionalInterface
interface D extends A {
	
}

interface E extends B {
	public void m3();
	public void m2();
	
}
interface F extends B{
	
}