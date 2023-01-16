package Webdriver_Arch;

public interface searchContext {
	
	public void findElement();
	public void findElements();
	
	default void test() {
		System.out.println("test");
	}

}
