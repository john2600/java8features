
public interface MyInterface {
	public double myMethod(int i);
	
	public default double myDefault(int x) {
		double r = 0;
		for(int i=0; i<x; i++) {
			r = r +myMethod(i);
		}
		return r;
	}
	
	public static void myStatic() {
		System.out.println("This is my Static");
	}
	
	public static void main(String[] args) {
		MyInterface i = x -> ( ( Math.random() * 10) * ( Math.sqrt(x)));
		
		System.out.println(i.myMethod(3));
		System.out.println(i.myMethod(4));
		System.out.println(i.myMethod(1));
		System.out.println(i.myMethod(2));
		System.out.println(i.myMethod(3));
		System.out.println(i.myMethod(1));
		System.out.println(i.myMethod(2));
		System.out.println();
		System.out.println(i.myDefault(10));
		
		MyInterface.myStatic();
	}
	
	
	
}
