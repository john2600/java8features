
public class StaticExample implements MyInterface{
	
	public static void main(String[] args) {
		StaticExample s = new StaticExample();
		
		StaticExample.m1();
		MyInterface.m1();
	}
	
	public static void m1() {
		System.out.println("Static methods overrided ");
	}
	
	public  void m2() {
		System.out.println("Static methods overrided ");
	}
}
