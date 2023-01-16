package BuilderPattern;

public class EcommApplication {
	
	//return this not applicable for static
	
	public EcommApplication login(String un, String pwd) {
		
		
		System.out.println("login with: " + un +":" + pwd);
//		return new EcommApplication();//it creates new object
		return this;// current object gets carried over-- 
//		avoids unnecessary object creation
	}
	public EcommApplication search(String productName) {
		System.out.println("search product:" + productName);
		return this;
	}
	public EcommApplication search(String productName, String color) {
		System.out.println("search product:" + productName + " : " + color);
		return this;
	}
	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart " + productName);
		return this;
	}
	public EcommApplication payment(String upi) {
		System.out.println("making payment via upi " + upi);
		return this;
	}
	public EcommApplication payment(String cc, int cvv) {
		System.out.println("making payment via cc " + cc + " : " + cvv);
		return this;
	}
	public EcommApplication getOrderID() {
		System.out.println("get order ID " + 1234);
		return this;
	}
	public EcommApplication logout() {
		System.out.println("logout");
		return this;
	}

}
