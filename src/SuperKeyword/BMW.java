package SuperKeyword;

public class BMW extends Car{
	
	int maxSpeed = 200;
	
	//SUPER
	// 1. can call parent class variable having the same var in child class
	//2. can call parent class method having the same method in child class
	//3. can call parent class const.. from child class..
//	but it should be the 1st statement
	
	//4. static variables or methods can be called by super keyword
	
	public BMW() {
		super(10,20);
		
		System.out.println("BMW----default constructor...");
	}
	@Override
	public void racing() {
		System.out.println("BMW---recing");
	}
	public static void refuel() {
		System.out.println("BMW----refuel");
	}
	private void test() {
		System.out.println("BMW----test");
	}
	
	public void info() {
		int carSpeed = super.maxSpeed;
		System.out.println(carSpeed);//100
		System.out.println(maxSpeed);//200
		
		super.racing();
		racing();
		
		System.out.println(price);
		System.out.println(super.price);
		
		refuel();
		super.refuel();
		Car.refuel();
	}
	
	
	public static void main(String[] args) {
		BMW b = new BMW();
		b.info();
	}

}
