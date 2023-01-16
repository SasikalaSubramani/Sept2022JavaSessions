package javasessions;

public class TestMethod {

	// data memebers
	// 1. class vars
	// 2. methods/functions

	// three types of functions:
	// 1. no input and no return
	// void - can not return anything
	public void test() {
		System.out.println("Test method");
		int z = 10 + 20 + 30;
		System.out.println(z);
	}

	// 2. no input with return
	public int printValue() {
		System.out.println("Print Value");
		int a = 10;
		int b = 20;
		int c = a + b;

		return c;

	}

	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}

	public double getTotalBill() {
		System.out.println("get total bill");
		int foodBill = 100;
		double drinks = 30.23;
		int dessert = 40;
		double totalamount = foodBill + drinks + dessert;
		return totalamount;
	}

	// 3. some input and some return
	// return type is int
	// parameters: x,y

	public int add(int x, int y) {
		System.out.println("Adding two numbers");
		int sum = x + y;
		return sum;
	}

	public boolean isActive() {
		System.out.println("user is active");
		return true;
	}

	public void click() {
		System.out.println("click on element");
//		return;
	}

	public void sendKeys(String value) {
		System.out.println("entering the value: " + value);
	}
	//Never pass unused parameters
	public int generateBill(int totalProducts, int discount) {
		System.out.println("generating the bill");
		int finalBill = totalProducts * 10;
		return finalBill;
	}

	public static void main(String[] args) {

		// call the function --> create the object of the class

		TestMethod t = new TestMethod();
		t.test();
		int p = t.printValue();
		System.out.println(p - 5);

		String n = t.getTrainerName();
		System.out.println("Trainer name is " + n);

		if (n.equals("Naveen")) {
			System.out.println("Naveen is from India");
		}

		double bill = t.getTotalBill();
		System.out.println("final bill: " + (bill - 50));

		int s1 = t.add(100, 200);// 100 and 200 both are arguments-- call by value
		System.out.println(s1);

		s1 = t.add(40, 50);
		System.out.println(s1);

		if (t.isActive()) {
			System.out.println("credit the salary");
		}
	}

}
