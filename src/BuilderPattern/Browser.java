package BuilderPattern;

public class Browser {
	
	String name;
	double version;
	
	// call by reference
	public void getBrowserInfo(Browser br1) {
//		br1.name = "firefox";
//		br1.version = 109.88;
		System.out.println(br1.name);
		System.out.println(br1.version);
	}

	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.name = "chrome";
		br.version = 102.33;
//		System.out.println(br.name);
//		System.out.println(br.version);
		
		br.getBrowserInfo(br);
		
//		System.out.println(br.name);
//		System.out.println(br.version);
	}

}
