package Webdriver_Arch;

public class AmazonTest {

	static Webdriver driver;

	public static void main(String[] args) {
		String browser = "firefox";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new chromeDriver();

			break;
		case "firefox":
			driver = new FirefoxDriver();

			break;
		case "safari":
			driver = new Safaridriver();

			break;

		default:
			break;
		}
//		chromeDriver driver = new chromeDriver();

		driver.get("https://www.amazon.com");

		driver.findElement();
		driver.findElements();

		driver.sendKeys("emailID", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginbutton");
		driver.getText("welcome naveen");
		driver.quit();

	}

}
