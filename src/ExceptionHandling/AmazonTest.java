package ExceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browser = "sasi";
		
		if (browser.equals("chrome")){
			System.out.println("launch chrome");
		}
		else if (browser.equals("ff")){
			System.out.println("launch ff");
		}
		else if (browser.equals("safari")){
			System.out.println("launch safari");
		}
		else {
			System.out.println("please pass the correct browser");
			throw new MyExeption("No browser Exception");
		}

	}

}
