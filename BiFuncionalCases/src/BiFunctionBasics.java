import java.util.function.BiFunction;

public class BiFunctionBasics {
	public static void main(String[] args) {
		BiFunction<Integer,Integer, Integer> b = (x,y)-> x*y;
		
		System.out.println(b.apply(30, 50));
		System.out.println(b.apply(30, 5));
	}
}
