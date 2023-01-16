package oop_encapsulation;

public class UserLogin {

	public static void main(String[] args) {
		
		LoginPage lp1 = new LoginPage("admin", "admin123", "superadmin");
		System.out.println(lp1.getUserName());
		System.out.println(lp1.getPassWord());
		System.out.println(lp1.role);
		
		lp1.setPassWord("admin345");
		System.out.println(lp1.getPassWord());
		
		System.out.println("************");
		
		LoginPage lp2 = new LoginPage("seller", "seller123", "selleradmin");
		System.out.println(lp2.getUserName());
		System.out.println(lp2.getPassWord());
		System.out.println(lp2.role);
		
		lp2.role = "sellersuperadmin";
		System.out.println("************");
		
		System.out.println(lp2.getUserName());
		System.out.println(lp2.getPassWord());
		System.out.println(lp2.role);
		
		System.out.println(lp1.getUserInfo());
		System.out.println(lp2.getUserInfo());
		
//		Application app = new Application();
		
		Application.getInfo();

	}

}
