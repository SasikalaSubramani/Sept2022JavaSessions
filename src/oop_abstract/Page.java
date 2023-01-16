package oop_abstract;

public abstract class Page {
	
	//can not create object
	
	//1. only abstract method --- 100% abstraction
	//2. only non abstract method --- 0% abstraction
	//3. abs + non abs ------partial abstraction or x% abstraction
	
	public Page() {
		System.out.println("Page----constructor");
	}
	
	public abstract void title();
	public abstract void url();
	
	public void pageTimeOut() {
		System.out.println("page time out ----20 secs");
	}

	public final void displayLogo() {
		System.out.println("page--------logo");
	}
	
	public static void pageStyle() {
		System.out.println("page-----Style");
		getPageTheme();
	}
	
	private static void getPageTheme() {
		System.out.println("get page theme");
	}
}
