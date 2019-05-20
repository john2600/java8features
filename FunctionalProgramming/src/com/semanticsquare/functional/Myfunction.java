package com.semanticsquare.functional;

public class Myfunction {
	public static void main(String[] args) {
		String name = "John";
		Service service = (a) -> {
			System.out.println("Hello Word " + a);
		};

		service.call(name);

		Operations operations = (a, b, c) -> {
			return Operations.operation(a, b, c);
		};

		System.out.println(operations.call(4, 9, "-"));

		Sum sum = (a, b) -> {
			return a + b;
		};
		System.out.println(sum.sum(30, 100));
		System.out.println(sum.sum(10, 100));
		System.out.println(sum.sum(300, 100));
		System.out.println(sum.sum(20, 100));
		System.out.println(sum.sum(90, 100));

		Size size = (value) -> {
			return value.length();
		};
		System.out.println(size.size("HEllo"));
		
		Quare quare = x->  x * x;
		
		System.out.println(quare.calc(3));
		
		Mult mult =  (int x ,int y)->  {return (x * y); }; 

	}
}

interface Service {
	public void call(String name);
}

interface Operations {
	public int call(int value1, int value2, String symbol);

	public static int operation(int a, int b, String symbol) {
		if (symbol.equals("+"))
			return a + b;
		else if (symbol.equals("-"))
			return a - b;
		else if (symbol.equals("*"))
			return a * b;
		else if (symbol.equals("/"))
			return a / b;
		return 0;
	}
}
interface Quare{
	int calc(int x);
}
interface Size {
	public int size(String value);
}

interface Sum {
	public int sum(int a, int b);

}

interface Mult {
	public int mult(int a, int b);

}