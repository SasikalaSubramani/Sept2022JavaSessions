package oop_abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LoginPage--constructor");
	}

	@Override
	public void title() {
		System.out.println("Lp----title");
		
	}

	@Override
	public void url() {
		System.out.println("LP------url");
		
	}
	
	public void doLogin() {
		System.out.println("Lp------doLogin");
	}
	
	

	

}
