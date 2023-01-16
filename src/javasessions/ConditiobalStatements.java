package javasessions;

public class ConditiobalStatements {

	public static void main(String[] args) {
		System.out.println(10==9);//== always generates boolean output either true or false
		
		int i=20;
		int j=20;
		// use == only for primitive data types
		if (i==j) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		//Dead code or unreachable code
		if(false) {
			System.out.println("Hi");
			
		}		
		
		else {
			System.out.println("bye");
		}
		
		boolean flag =true;
		
		if (flag) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye!!");
		}
		
		//Nested if condition
		
		int marks=99;
		
		if(marks>=90) {
			if(marks>=95) {
				System.out.println("Grade A++");
				if (marks==100) {
					System.out.println("eligible for scholarship");
				}
				else {
					System.out.println("not eligible for scholarship");
				}
			}
			else {
			System.out.println("Grade A");
			}
		}
		else {
			System.out.println("Grade B");
		}
		
		// never use == for non primitive data compariosn
		String s1="Selenium";
		String s2="Selenium";
		
		if(s1.equals(s2)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		//
		
		String br="opera";
		if(br.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if (br.equals("firefox")) {
			System.out.println("launch firefox");
		}
		else if (br.equals("edge")) {
			System.out.println("launch edge");
		}
		else if (br.equals("ie")) {
			System.out.println("launch ie");
		}
		else  {
			System.out.println("please pass the correct browser....." + br);
		}
		

	}

}
