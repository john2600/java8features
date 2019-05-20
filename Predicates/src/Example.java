import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Example {
	public static void main(String[] args) {
		Predicate<Integer> predicate = i->i>10;
		System.out.println(predicate.test(30));
		System.out.println(predicate.test(3));
		//System.out.println(predicate.test("3"));e incompatable type
		
		Predicate<String> predicate2 = i->i.length()>5;
		
		System.out.println(predicate2.test("Pepe"));
		System.out.println(predicate2.test("abavavas"));
		
		Predicate<Collection<String>> predicate3 =  c->c.isEmpty();
		
		List<String> elemetns = new ArrayList<>();
		elemetns.add("a");
		elemetns.add("b");
		System.out.println(predicate3.test(elemetns));
	}
}
