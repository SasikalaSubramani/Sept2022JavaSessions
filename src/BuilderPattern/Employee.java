package BuilderPattern;

public class Employee extends Company {
	
	String name;
	int id;
	double salary;
	
	public Employee() {
		super();
		System.out.println("empp const.......");
	}

	public Employee(String name, int id, double salary) {
		super(name, salary);
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public static void main (String[] args) {
		Employee e = new Employee("Tom", 123, 12.33);
		System.out.println(e.name + " " + e.id  + " " + e.salary);
	}

}
