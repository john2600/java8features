
//@FunctionalInterface
public interface MyInterface {

	//public void m1();

	default void m2() {
		System.out.println("hello");
	}

}
