package javasessions;

public class ArithmaticConcept {

	public static void main(String[] args) {
		int i=9;
		int j=3;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		
//		System.out.println(9/0);Arithmetic Exception
		System.out.println(0/900);
		
		System.out.println(9/2);//4 -->both the numbers are int
		
		System.out.println(9.0/2);//4.5 -->one of the value is float
		
		System.out.println(9/2.0);
		
		System.err.println(9.0/2.0);
		
		System.out.println(-9-2);
		
		System.out.println(9.0/0);//Infinity 
		
//		System.out.println(0/0);//Arithmetic Exception
		System.out.println(9/0.0);//Infinity 
		System.out.println(9.0/0.0);
		System.out.println(0.0/0); //NaN
		System.out.println(0.0/0.0);//NaN
		
//		System.out.println(0/0);//Arithmetic Exception
		System.out.println(9%3);//% gives reminder values 9 modules 3
		System.out.println(9%2);
		System.out.println(20%3);
		System.out.println(100%7);
		
		//
		System.out.print("Naveen"); //println generates a new line
		System.out.println("testing");
		System.out.println("bye");
		
		
		
		
		

	}

}
