package Assignments;

public class Mobile {
	
	//Object assignment
	
	String brand;
	String color;
	String storage;
	double price;

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.brand = "iPhone";
		m1.color = "Silver";
		m1.storage = "256GB" ;
		m1.price = 70.00;
		
		Mobile m2 = new Mobile();
		m2.brand = "Realme";
		m2.color = "Blue";
		m2.storage = "64GB" ;
		m2.price = 15.00;
		
		Mobile m3 = new Mobile();
		m3.brand = "Samsung";
		m3.color = "Black";
		m3.storage = "128GB" ;
		m3.price = 30.00;
		
		Mobile m4 = new Mobile();
		m4.brand = "OnePlus";
		m4.color = "Black";
		m4.storage = "128GB" ;
		m4.price = 40.00;
		
		System.out.println(m1.brand + " " + m1.color + " " + m1.storage + " " + m1.price);
		System.out.println(m2.brand + " " + m2.color + " " + m2.storage + " " + m2.price);
		System.out.println(m3.brand + " " + m3.color + " " + m3.storage + " " + m3.price);
		System.out.println(m4.brand + " " + m4.color + " " + m4.storage + " " + m4.price);
		
		m1 = m2;// m1 = Realme m2 = Realme M3 = Samsung m4 = OnePlus
		m2 = m3;//m1 = Realme m2 = Samsung M3 = Samsung m4 = OnePlus 
		m3 = m4;//m1 = Realme m2 = Samsung M3 = OnePlus m4 = OnePlus
		m4 = m1;//m1 = Realme m2 = Samsung M3 = Onplus m4 = Realme
		
		System.out.println("**************************************");
		System.out.println(m1.brand + " " + m1.color + " " + m1.storage + " " + m1.price);
		System.out.println(m2.brand + " " + m2.color + " " + m2.storage + " " + m2.price);
		System.out.println(m3.brand + " " + m3.color + " " + m3.storage + " " + m3.price);
		System.out.println(m4.brand + " " + m4.color + " " + m4.storage + " " + m4.price);
		
		
		
		
	}

}
