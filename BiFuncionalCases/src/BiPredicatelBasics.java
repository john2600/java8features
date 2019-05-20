import java.util.function.BiPredicate;

public class BiPredicatelBasics {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> c=(a,b)-> (a+b)%2==0;
		
		System.out.println(c.test(30, 60));
		
		System.out.println(c.test(30, 65));
	}
}
