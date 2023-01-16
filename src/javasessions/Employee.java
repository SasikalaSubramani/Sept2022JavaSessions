package javasessions;

public class Employee {
	
	//class variables
	String name;
	int age;
	double salary;
	boolean isPerm;

	public static void main(String[] args) {
		
		//create the object: new keyword
		
		Employee e = new Employee();
		
		//Employee is a class
		//e is object reference name
		//right hand side is called object --> new Employee()
		//object will be created inside heap memory
		//reference will be stored in stack memory
		//all the class variables will be copied to newly created object
		
		e.name = "Vijay";
		e.age = 25;
		e.salary = 12.33;
		e.isPerm = true;
		
		System.out.println(e);// garbage value
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.isPerm);
		
		Employee e1 = new Employee();
		
		// prints all the default values
		System.out.println(e1.name);//null
		System.out.println(e1.age);//0
		System.out.println(e1.salary);//0.0
		System.out.println(e1.isPerm);//false
		
		// No reference objects--> it is always a bad practice
		new Employee().name="Tom"; // no reference object
		new Employee().age = 30; // this creates new object
		
		//null reference object		
		Employee e3 = new Employee();		
		e3 = null;
//		e3.name ="Sasi";//null pointer exception-->NPE		
//		System.out.println(e3.name);
		
		Employee e4 = null;
//		System.out.println(e4.name ); //NPE
		

	}

}
