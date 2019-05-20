
public interface Left {
	default void m2() {
		System.out.println("left");
	}
	
	default void m1() {
		System.out.println("right");
	}
}
