import java.util.function.BiConsumer;

public class BiConsumerBasics {
	public static void main(String[] args) {
		BiConsumer<String,String> f = (x,y)->System.out.println(x+" "+ y);
		
		f.accept("hello", "World");
	}
}
