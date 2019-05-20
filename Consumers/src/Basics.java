import java.util.function.Consumer;

public class Basics {
	public static void main(String[] args) {
		Consumer<String> c = i->System.out.println(i);
		c.accept("Hello world");
		
	}
}
