import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {

		Function<Student, String> l = (i) -> {
			String result = null;
			if (i.getGrade() >= 80) {
				result = "condecoration";
			} else if (i.getGrade() >= 60) {
				result = "First Place";
			}

			else if (i.getGrade() >= 40) {
				result = "Second place";
			}

			else if (i.getGrade() >= 30) {
				result = "third place";
			} else {
				result = "fail";
			}

			return result;
		};

		List<Student> students = new ArrayList<>();
		{
			students = new ArrayList<>();
			students.add(new Student("juan", 90));
			students.add(new Student("Pepe", 80));
			students.add(new Student("maick", 20));
			students.add(new Student("andrea", 50));
			students.add(new Student("Cesaro", 60));
		}
		Predicate<Integer> qualification = i -> i >= 50;
		for (Student student : students) {
			if (qualification.test(student.getGrade())) {
				System.out.println(l.apply(student));
				System.out.println(student);
				System.out.println();
			}
		}

	}

}
