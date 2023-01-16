package javasessions;

public class DatatypesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Keyword shd start with small letter
		
		//Primitive data types : No need to create the object
		
		//Boolean : boolean:true/false
		//Numeric Type: 
					//A.Integral Type
							// Integer: byte, short,int,long
							//Floating Type:float,double
					//B. Character: char -- 'A', 'B', '$'
		
		//Non Primitive data types: class, array, interface, abs class
		
		//1.byte
		
		//range: -128mto +127 --->-2^7 to 2^7+1
		//size: 1 byte = 8 bits
		
		byte b = 10;
		System.out.println(b);
		
		b= 30;
		System.out.println(b);
		
		byte e=0;
		byte h= -10;
		
		
		byte b1=10;
		byte b2 = 20;
		int b3=b1+b2;// we can not store addition of 2 byte in a byte bcz it might generate big number
		
		//2. short:
		//range =-32767 to 32768 ---> -2^15 to 2^15+1
		//size: 2 bytes =2*8 = 16 bits
		
		short sh=400;
		short gh=4000;
		int sum = sh+gh;
		
		System.out.println(sh+gh);
		
		//3. int
		//range -2147483648 to 2147483647 ---> -2^31 to 2^31+1
		//size 4 bytes = 32bits
		int i=10;
		int num=909090;
		int total=2345678;
		System.out.println(total+i);
		System.out.println(num+i);
		
		//4.long
		//range: -2^63 to 2^63+1
		//size: 8 bytes = 64bits
		long l=2121212121;
		long dist = 3048309588472504L; // when the number exceeds int limit (9 digit) we have to specify the L(l) in the end
		System.out.println(dist);
		
		// mobile num, CC, debit, AAdhar card, SSN, Acc number
		//String - as these numbers are constants
		
		
		//5 float: 
		//size 4 byte = 32 bits
		//range: up to 7 decimal digits
		float f = 12.33F; 
		float f1=(float)34.44;
		System.out.println(f);
		System.out.println(f1);
		
		float F2=100;
		System.out.println(F2);
		
		//6. double: 
		//size : 8 bytes = 64 bits
		//range: up to 15 decimal digits
		
		double d1= 12.3333333;
		double d2=1.3465789800;
		
		//7. char:
		//size : 2 bytes = 16 bits
		//range 
		// a-z = 97 to 122
		//A-Z = 65 to 90
		//0-9 = 48 to 57
		// stores only single digit value
		char c1='a';//ascii value 97
		char s1='b';//ascii value 98
		char c2='1';
		char c3='$';
		char c4= 'A';
		
		System.out.println(c1);
		System.out.println(c1+s1);//97+98 = 195
		System.out.println(c1-s1);//97-98 = -1
		// print ASCII value of a
		System.out.println((int)c1);
		System.out.println((byte)'a');
		
		//Boolean:True or False
		//size: ~1 bit
		//true and false both are keywords
		
		boolean br= true;
		boolean br1 = false;
		
		boolean userIsActive= true;
		boolean isPermanent= false;
		
		boolean flag= true;
		
		
		
		
	}

}
