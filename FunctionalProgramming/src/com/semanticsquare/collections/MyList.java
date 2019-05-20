package com.semanticsquare.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyList {
	public void myList() {
		Comparator<Integer> comparator = (a, b) -> {
			return (a > b) ? -1 : (b > a) ? 1 : (a == b) ? 0 : -1;
		};

		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(10);
		list.add(90);
		list.add(20);
		Collections.sort(list, comparator);

		System.out.println(list);

	}

	public static void main(String[] args) {
		MyList myList = new MyList();
		myList.myList();
	}
}
