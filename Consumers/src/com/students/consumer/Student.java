package com.students.consumer;

public class Student {
	private String name;
	private int mark;

	public Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}

	public int getMark() {
		return this.mark;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return String.format("name:%s mark:%d ", this.name, this.mark);
	}
}
