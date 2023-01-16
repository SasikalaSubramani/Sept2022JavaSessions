package Webdriver_Arch;

public class chromeDriver implements Webdriver {
	
	public chromeDriver () {
		System.out.println("Launch chrome browser");
	}

	@Override
	public void findElement() {
		System.out.println("find the element");
		
	}

	@Override
	public void findElements() {
		System.out.println("find the elements");
		
	}

	@Override
	public void get(String url) {
		
		System.out.println("launch url :"+url);
	}

	@Override
	public void click(String element) {
		
		System.out.println("clicking on element: " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Enter value in element: "+element +" "+value);
		
	}

	@Override
	public String getText(String ele) {
		System.out.println("Getting text of: " + ele);
		String str = "Amazon header";
		return str;
	}

	@Override
	public boolean isDisplayed(String ele) {
		System.out.println("element is displayed: " + ele);
		return false;
	}

	@Override
	public void quit() {
		System.out.println("Closing the browser");
		
	}
	@Override
	public void test() {
		System.out.println("test");
	}
	



}
