import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(30);
		numbers.add(130);
		numbers.add(230);
		numbers.add(340);
		numbers.add(-350);

		Integer [] result = numbers.stream().toArray(Integer[]::new);
		
		for(Integer value:result) {
			System.out.println(value);
		}
		
	}
}
