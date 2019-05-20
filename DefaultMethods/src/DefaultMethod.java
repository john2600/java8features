
public class DefaultMethod implements MyInterface, Left {
	
	public static void main(String[] args) {
		DefaultMethod m = new DefaultMethod();
		m.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Left.super.m2();
	}

//	@Override
//	public void m2() {
//		System.out.println("my method");
//		
//	}

}
