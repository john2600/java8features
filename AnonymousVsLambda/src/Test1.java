
public class Test1 {
	int x = 999;
	
	public void m2() {
		MyInter myInter = new MyInter() {
			int x = 888;
			public void m1() {
				System.out.println(this.x);
			}

		};
		myInter.m1();
	}
	
	public void m3() {
		final int y = 30;
		MyInter myInter = () -> {
			int x = 888;
				System.out.println(this.x);
				System.out.println(y);
				x=301;
				//y=90;
		};
		myInter.m1();
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m2();
		t1.m3();
	}
}

