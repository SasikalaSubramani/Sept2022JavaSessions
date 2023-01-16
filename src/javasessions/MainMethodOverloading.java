package javasessions;

public class MainMethodOverloading {
	
	//jvm considers only the main method which has one string array param

	public static void main(String p [] ) {
		System.out.println("Hi");
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "Tom");

	}
	public static void main(String p ) {
		System.out.println("hi java");
		System.out.println(p);

	}
	
	public static void main(int i ) {
		System.out.println("bye");
		System.out.println(i);

	}
	public static void main(int i, String p ) {
		System.out.println("hello");
		System.out.println(i+p);

	}

}
