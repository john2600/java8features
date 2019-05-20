
public class MyClass {
	
	public int i=1;
	{
		
		System.out.println("step 1");
	}{
		System.out.println("step 2");
	}
	public MyClass() {
		System.out.println("step 3");
	} {
		System.out.println("step 4");
	}
	
	public class MyInnerClass{
		public int i=2;
		{
			System.out.println("step 5");
		}
	}
	static class C{
		int i=3;
	}
	
	static {
		
				System.out.println("step 7"); {
			
		}
	}
	

	public static void main(String[] args) {
		MyClass myclass = new MyClass();
		
		System.out.println(myclass.i); 
		
		MyClass.MyInnerClass my = myclass.new MyInnerClass();
		System.out.println(my.i);
		
		MyClass.C c = new MyClass.C();
		System.out.println(c.i);
		
	}
}
