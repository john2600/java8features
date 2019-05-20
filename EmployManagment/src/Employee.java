
public class Employee {
	String name;
	String designation;
	double salary;
	String city;

	Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %f , %s", this.name, this.designation, this.salary, this.city);
	}

}
