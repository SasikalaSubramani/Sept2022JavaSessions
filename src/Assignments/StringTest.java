package Assignments;

import java.lang.reflect.Array;

public class StringTest {

	public static void main(String[] args) {
//		StringBuilder input = new StringBuilder("This is Gnana");
//		
//		System.out.println(input.reverse());
		
		String input = "This is Gnana";// input 		
		String words[] = input.split(" ");// words array conversion		
		String output ="";
		
		for (String s : words) {
			System.out.println(s);// is
			StringBuilder sb = new StringBuilder(s);
			sb.reverse();//si
			output=output + sb + " ";//sihT si 
			
			
		}
		System.out.println(output);

	}

}
