package com.bifunction.example;

public class Student {
	private String name;
	private int rolln;

	public Student(String name, int rolln) {
		this.name = name;
		this.rolln = rolln;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRolln() {
		return rolln;
	}

	public void setRolln(int rolln) {
		this.rolln = rolln;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rolln=" + rolln + "]";
	}

}
