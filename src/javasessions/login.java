package javasessions;

public class login {
	
	String username;
	String password;
	
	

	public login(String username, String password) {
		
		this.username = username;
		this.password = password;
	}

	public void doLogin() {
		
		System.out.println("enter username " + username);
		System.out.println("enter password " + password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
		
	}

	public static void main(String[] args) {
		login lp1 = new login("naveen@gmail.com" , "naveen123");
		lp1.doLogin();
		
		login lp2 = new login("tom@gmail.com" , "tom123");
		lp2.doLogin();
	}

}
