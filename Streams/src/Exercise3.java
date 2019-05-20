import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(130);
		numbers.add(230);
		numbers.add(340);
		numbers.add(-350);
		
		System.out.println(numbers);

		Integer min = numbers.stream().min((x,y)->x.compareTo(y)).get();
		
		System.out.println(min);
		
		Integer major = numbers.stream().max((x,y)->x.compareTo(y)).get();
		
		System.out.println(major);
		
		numbers.stream().forEach(i->System.out.println(i));
		
		System.out.println();
		
		numbers.stream().forEach(System.out::println);
		
	}
}
