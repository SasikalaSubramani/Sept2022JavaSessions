package javasessions;

public class Department {
	
	public void sendMail() {
		System.out.println("send mail");
	}
	public static void getInfo() {
		System.out.println("get info");
	}

	public static void main(String[] args) {
		Department d = new Department();
		d.sendMail();
		d.getInfo();
		
		//1.using class name:
		Department.getInfo();

		//2. calling it directly
		getInfo();
		
		//how to call non static vars and methods
		//1. create object and use object reference name
		
		//how to call static var and methods
		//1. using class name
		
		System.out.println(CarType.wheels);
	}

}
