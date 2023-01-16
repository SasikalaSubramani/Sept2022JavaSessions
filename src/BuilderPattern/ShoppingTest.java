package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcommApplication obj = new EcommApplication();
		
		//Builder Pattern---Chain calling
		obj.login("Sasi", "Sasi@123")
			.search("iMac")
				.addToCart("iMac")
					.payment("1234 5432 4567 4567", 900)
						.getOrderID()
							.logout();
		
		System.out.println("--------------");
		//
		obj.login("Tharsh", "Tharsh@123")
			.search("iPad", "Silver")
				.addToCart("iPad")
					.logout();
		
		System.out.println("--------------");
		//
		obj.login("Tharsh", "Tharsh@123")
			.search("BT", "Black")
					.logout();
		
		System.out.println("--------------");
		//
		obj.login("Tharsh", "Tharsh@123")
					.logout();
		
		
				
			
							
					

	}

}
