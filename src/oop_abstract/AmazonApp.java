package oop_abstract;

public class AmazonApp {

	public static void main(String[] args) {
		
		//parent cons--> child const
		//Run it ->parent cons--> child const
		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.doLogin();
		
		Page.pageStyle();
//		LoginPage.pageStyle();
		
		//topcasting
		//child object can be referred by parent abstract class ref
		Page p = new LoginPage ();
		
		p.title();
		p.url();
		p.displayLogo();

	}

}
