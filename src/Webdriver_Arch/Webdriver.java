package Webdriver_Arch;

public interface Webdriver extends searchContext{
	
	//1. only abstract method --- 100% abstraction
	
	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	public void get(String url);
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public String getText(String ele);
	
	public boolean isDisplayed(String ele);
	
	public void quit(); 
	
	@Override
	default void test() {
		System.out.println("test");
	}

}
