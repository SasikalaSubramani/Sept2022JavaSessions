package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//1 to 10
		//while
		
		// use case of while loop
		//number of iterations/cycles are not fixed
		//1. total images/links on the page
		//2. LinkedIn/Facebook/swiggy-->search for something -->infinite scrolling
		//3. search for the element which is coming after x seconds
		//4. email in inbox
		//5. page load time out
		
		//use case of for loop
		//number of iterations are fixed
		//drop down - months 1 to 12 in calendar
		//footer links
		//number of seats 
		//calendar
		
		
		int i =1;
		while (i<=10) {
			System.out.println(i);
			++i;			
		}
		
		//
		System.out.println("***************************");
		short sh =1;
		while (sh<=10) {
			System.out.println(sh);
			sh++;			
		}
		
		//
		System.out.println("***************************");
		double d =1.1;
		while (d<=10.0) {
			System.out.println(d);
			d++;			
		}
		
//		System.out.println("***************************");
//		//print A to Z
//		int al=65;
//		while (al<=90) {
//			System.out.println((char)al);
//			al++;
//		}
		
		System.out.println("***************************");
		for (char c='a'; c<='z'; c++) {
			System.out.print(c+" ");
		}
//		System.out.println("***************************");
//		al=97;
//		while (al<=122) {
//			System.out.println((char)al);
//			al++;
//		}
		// 
		System.out.println("***************************");
		
		// break will not break the condition, it breaks the entire loop
		int p = 1;
		while (p<+10) {
			System.out.println(p);
			if(p==5) {
				System.out.println("bye!!!");
				break;
			}
			p++;
		}
		
		//10 to 1
		System.out.println("***************************");
		i = 10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		
		// 2.for loop
		System.out.println("***************************");
		 for (int f=1; f<=10; f++) {
			 System.out.println(f);
		 }
		
		//for loop with break
		 
		 System.out.println("***************************");
		 
		 for (int e=1; e<=100; e++) {
//			 System.out.println(e);
			 if(e%2 != 0) {
				 System.out.println(e);
			 }
		 }
		 
		 // print ascii value of a-z without using typecasting
		 
		 System.out.println("***************************");
			for (char c='a'; c<='z'; c++) {
				System.out.println(c+"="+(c+0));
			}
			//3. do-while loop
			int v=1;
			do {
				
				System.out.println(v);
				v++;
			}
			while(v<=10);
			
	}
	
	
	

}

// 1 to 100 - even/odd
//10 to 1

