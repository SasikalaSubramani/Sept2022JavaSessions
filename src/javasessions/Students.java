package javasessions;

public class Students {
	// Method Overloading: poly (many)+ morphism (forms): compile time :static
	// polymorphism
	// within the same class when we have multiple methods
	// 1. with the same method name
	// 2. with diff params
	// 3. with diff seq of params
	// 4. return type doesn't matter

	// Advantage

	//

	public void test() {
		System.out.println("0 param");
	}

	// duplicate : return type doesn't matter only param matters
//	public int test() {
//		System.out.println("0 param");
//		return 100;
//	}
	public void test(int i) {
		System.out.println("1 param " + i);
	}

	public void test(String i) {
		System.out.println("1 param");
	}

	public void test(int p, String i) {
		System.out.println("2 params");
	}

	public void test(String i, int p) {
		System.out.println("2 params " + i + p);
	}

	// ecomm: amazon

	// login

	public void login() {
		System.out.println("login with no creds");
	}

	public void login(String username, String password) {
		System.out.println("login with right creds");
	}

	public void login(String username, String password, String role) {
		System.out.println("login with right creds");
	}

	public void login(String username, String password, int otp) {
		System.out.println("login with right creds");
	}

	// search
	public void search() {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

//	payment
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String bankName, String password, String userID) {

	}
	// Uber

	// booking

	public void booking() {

	}

	public void booking(String carType) {

	}

	public void booking(String carType, String stPoint, String endPoint) {

	}

	public void booking(String carType, String stPoint, String endPoint, int passengers) {

	}

	// selenium example

	public void launchUrl(String url) {

	}

	public String launchUrl(String url, String queryParam, String browserName) {
		String mainUrl = url + queryParam;
		System.out.println("launch " + browserName);
		return mainUrl;

	}
	// can we overload static methods: YES

	public static void getInfo(String name) {

	}

	public static void getInfo(String name, String deptName) {

	}

	public static void main(String[] args) {
		Students st = new Students();

		st.test(10);
		st.test("Tom", 25);
		Students.getInfo("Sasi");
	}

}
