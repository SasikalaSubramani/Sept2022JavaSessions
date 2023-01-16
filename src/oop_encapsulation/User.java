package oop_encapsulation;

public class User {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName("Tom");		
		e1.setAge(25);
		e1.setSalary(12.33);
		
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());
		
		Browser br = new Browser();
		br.launchBrowser();
		
		//POST - create a user
		Customer c1 = new Customer("Vaisali", 101, "Vaisali@gmail.com" );
		//GET - get user info
		System.out.println(c1.getName() + " " + c1.getUserId() + " " + c1.getEmailId());
		//PUT/PATCH -update a user
		c1.setName("sasi");
		//GET - get user info
		System.out.println(c1.getName() + " " + c1.getUserId() + " " + c1.getEmailId());
		c1.setEmailId("sasi@gmail.com");
		System.out.println(c1.getName() + " " + c1.getUserId() + " " + c1.getEmailId());
	}

}
