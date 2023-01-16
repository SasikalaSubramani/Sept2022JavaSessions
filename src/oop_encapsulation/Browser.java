package oop_encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launching browser...");
		checkBrowserVersion();
		checkBrowserOSCompatability();
		checkRAMSpace();
		checkOSBrowserService();
		System.out.println("Browser is launched");
	}
	private void checkBrowserVersion() {
		System.out.println("checking browser version...");
	}
	private void checkBrowserOSCompatability() {
		System.out.println("checking browser OS Compatability...");
	}
	private void checkRAMSpace() {
		System.out.println("checking RAM Space...");
	}
	private void checkOSBrowserService() {
		System.out.println("checking OS browser service...");
	}

}
