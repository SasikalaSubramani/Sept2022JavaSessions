package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		
		//TimeComplexity
		
		// denoted by Big O(n)
		
		int i=1; 
		//O(1)
		
		String s= "Java";//O(1)
		System.out.println(s);//O(1)
		
		for (int k=1; k<=10; k++) {
			System.out.println(k);
		}
		//1+n+n+n = 3n+1--> linear equation
		//3n+1 --> 3n-->O(n)
		
		for (int k=1; k<=10; k++) {
			
			for (int p=1; p<=10; p++) {
				System.out.println(k+""+p+" ");
			}
		}
		//(1+n+n)(1+n+n+n)==> (1+2n)(1+3n)=>1+3n+2n+6n^2==>6n^2+5n+1
		//6n^2+5n==> n(6n+5)=>6n^2==>n^2==>O(n^2)
		
		
	}
	}
