package com.semanticsquare.collections;

public class Comparator implements java.util.Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1>o2) return -1;
		else if(o1<o2) 
			return +1;
		return 0;
	}
	

}
