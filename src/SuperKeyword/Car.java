package SuperKeyword;

public class Car extends Vehicle {
	
	int maxSpeed = 100;
	
	int price =500;
	
	public Car () {
		System.out.println("Car---default constructor");
	}
	public Car (int i) {
		System.out.println("Car---constructor " + i);
	}
	public Car (int i,int j) {
		System.out.println("Car---constructor " + i+ " " + j);
	}
	
	public void racing() {
		System.out.println("Car---recing");
	}
	public static void refuel() {
		System.out.println("car----refuel");
		test();
	}
	private static void test() {
		System.out.println("Car----test");
	}

}
