package javasessions;

public class Users {

	String name;
	int id;
	String dob;
	String city;
	boolean isActive;

	// fun vs cons

	// fun may or may not retuen the value but const.. will never return anything
	// fun will be called with the obj ref, but const.. will be called when we
	// create the object
	// buss logic will be written inside the func.. constructor is used to
	// initialize the class var

//	public Users() {
//		System.out.println("default const..........");
//	}
	public Users(String name, int id) {
		System.out.println("2 param");

		// with the help of this keyword we can access class variables
		this.name = name;
		this.id = id;

	}

	public Users(String name, int id, String city) {
		System.out.println("3 Param...");
		this.name = name;
		this.id = id;
		this.city = city;
	}
	

	public Users(String name, String dob, String city) {
		
		this.name = name;
		this.dob = dob;
		this.city = city;
	}

	public Users(String name, int id, String dob, String city, boolean isActive) {
		
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.city = city;
		this.isActive = isActive;
	}

	public static void main(String[] args) {

		Users u1 = new Users("Tom", 101);
		System.out.println(u1.name);
		System.out.println(u1.id);
		
		Users u2 = new Users("Peter", 102, "LA");
		System.out.println(u2.name + " " + u2.id + " " + u2.city );
		
		Users u3 = new Users("Lisa", 103, "01-01-1990", "Pune", true);
		
		
		

	}

}
