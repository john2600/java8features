import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class App {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Juan", "CEO", 3000, "NY"));
		employees.add(new Employee("Pepe", "Manager", 2000, "BOGOTA"));
		employees.add(new Employee("John", "programmer", 5000, "BUENOS AIRES"));
		employees.add(new Employee("Andrea", "tester", 2000, "LONDRES"));
		employees.add(new Employee("Andrea", "tester", 2000, "A"));
		employees.add(new Employee("Andres", "Manager", 1500, "DUBLIC"));
		employees.add(new Employee("Cesar", "QA", 2500, "BERLIN"));
		employees.add(new Employee("Claudia", "Manager", 2500, "BERLIN"));

		Predicate<Employee> isManager = employee -> employee.getDesignation().equals("Manager");
		display(isManager, employees);

		Predicate<Employee> cityValid = employee -> employee.getCity().equals("LONDRES");
		display(cityValid, employees);

		Predicate<Employee> salary = employee -> employee.getSalary() > 2000;
		display(salary, employees);

		Predicate<Employee> salaryMinor = employee -> employee.getSalary() < 2000;
		display(salaryMinor, employees);

		System.out.println("Find minor salary from list");

		Double employeeSalary = employees.stream().mapToDouble(x -> x.getSalary()).min()
				.orElseThrow(NoSuchElementException::new);
		System.out.println("value found " + employeeSalary.doubleValue());

		Employee employeeObject = employees.stream().max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);

		System.out.println(employeeObject.toString());

		Comparator<Employee> salaryBigger = Comparator.comparing(Employee::getSalary);

		Employee resultSalaryBigger = employees.stream().max(salaryBigger).get();

		System.out.println(" max=" + resultSalaryBigger);

		Employee resultSalaryMinor = employees.stream().min(salaryBigger).get();
		System.out.println(" min=" + resultSalaryMinor);

		Comparator<String> compa = Comparator.comparing(String::valueOf);
		String nameResult = employees.stream().map(a -> a.getName()).max(compa).get();
		System.out.println(" letter max " + nameResult);

		nameResult = employees.stream().map(a -> a.getName()).min(compa).get();
		
		System.out.println(" letter min " + nameResult);
		
		Comparator<Employee> otherComp = Comparator.comparing(Employee::getName);
		Employee employeRe = employees.stream().min(otherComp).get();
		System.out.println(employeRe.toString());
		
		display(salary.and(isManager), employees);
		
		display(isManager.negate(), employees);
		
		Predicate<String> checkIsManager = Predicate.isEqual("Manager");
		System.out.println(checkIsManager.test(resultSalaryMinor.getDesignation()));
		
		

	}

	public static void display(Predicate<Employee> pr, List<Employee> empl) {

		empl.stream().filter(emp -> pr.test(emp)).forEach(x -> System.out.println(x.toString()));
		System.out.println();
	}
}
