package com.semanticsquare.collections;

public class Simpson implements Comparable<Simpson> {
	private String name;

	public Simpson(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Simpson o) {
		return o.name.compareTo(o.name);
	}

}
