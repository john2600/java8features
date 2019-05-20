import java.util.function.Function;

public class Basics {
	public static void main(String[] args) {
		Function<String,Integer> fun = i->i.length();
		
		Integer result = fun.apply("Sebastian");
		System.out.println(result);
		
		Function<Integer,Integer> multiply = i->i*i;
		
		System.out.println(multiply.apply(5));
		System.out.println(multiply.apply(15));
		System.out.println(multiply.apply(25));
		System.out.println(multiply.apply(3));
		System.out.println(multiply.apply(4));
		
		
	}
}
