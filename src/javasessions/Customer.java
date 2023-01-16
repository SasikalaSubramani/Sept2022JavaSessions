package javasessions;

public class Customer {

	String name;
	int id;
	String city;
	boolean isActive;

	// Constructor: class body: looks like a func but it is not a func
	// can not return anything
	// name shd be same as class

	// 0 param constructor or default const
	public Customer() {
		System.out.println("0 param");

	}
	//Constructor overloading

	public Customer(int i) {
		System.out.println("1 param " + i);
	}

	public Customer(int i, int j) {
		System.out.println("2 param " + i + j);
	}

	public Customer(int i, String p) {
		System.out.println("2 param " + i + p);
	}
	
	public Customer(String p, int i) {
		System.out.println("2 param " + p + p);
	}

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer(10);
		Customer c3 = new Customer(10,20);
		Customer c4 = new Customer(10,"Sasi");
		Customer c5 = new Customer("Sasi", 10);
		
		
		

	}

}
