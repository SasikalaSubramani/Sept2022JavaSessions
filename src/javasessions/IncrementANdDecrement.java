package javasessions;

public class IncrementANdDecrement {

	public static void main(String[] args) {
		
		//++
		//--
		
		//1.post increment
		int a=1;
		int b= a++;
		System.out.println(a);//2 -->final a value is 2
		System.out.println(b);//1
					
		int g=-98;
		int h=g++;
		
		System.out.println(g);
		System.out.println(h);
		
		//2.pre increment
		
		int c=1;
		int d=++c;
		System.out.println(c);
		System.out.println(d);
		
		int t=-99;
		int p=++t;
		System.out.println(t);
		System.out.println(p);
		
		//3.post decrement
		
		int k=2;
		int m=k--;
		System.out.println(k);
		System.out.println(m);
		
		//4.pre decrement
		
		int e= 2;
		int f=--e;
		System.out.println(e);
		System.out.println(f);
		
		int u=2;
		System.out.println(u++);
		
		System.out.println(u);
		
		int w=2;
		
		System.out.println(++w);
		System.out.println(w);
		
		
	}
	
		

}
