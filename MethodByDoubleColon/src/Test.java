
public class Test {
	public static void m2() {
		System.out.println("Hello world");
		System.out.println("This is the Implementation by Method reference");
	}

	public static void main(String[] args) {
		MyInterface i = Test::m2;
		i.m1();
	}
}

