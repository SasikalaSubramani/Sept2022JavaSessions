package javasessions;

public class CarType {

	String name;
	int price;
	String color;
	static final int wheels = 4;
	
	//static value can be changed anywhere 
	//static is not applicable for local var
	//final is constant-->can not be changed
	// object cannot hold static members
	
	

	public static void main(String[] args) {
		
		final int p =10; //local variables

		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 50;
		c1.color = "Black";

		// how to access static variable
		System.out.println(c1.wheels);

		// 1. use it by class name
		System.out.println(CarType.wheels);

		// 2. access it directly
		System.out.println(wheels);
		// main method and wheels both are static
//		-->static property can directly access static members
		System.out.println(c1.name + " " + c1.price + " " +c1.color + " " + CarType.wheels);
		
//		CarType.wheels = 10;
//		System.out.println(c1.name + " " + c1.price + " " +c1.color + " " + CarType.wheels);
		
		
		
		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.color = "Blue";

		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "white";
		
		Department.getInfo();

	}

}
