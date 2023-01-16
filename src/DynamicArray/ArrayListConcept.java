package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		 
		//ArrayList is a class which implements List interface
		//default class
		//dynamic array
		ArrayList ar = new ArrayList();
		// add values
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		ar.add("java");
		ar.add(12.33);
		ar.add(true);
		ar.add('a');
		
		// get values
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		
		//size
		System.out.println(ar.size());
		
//		to print all the values
		//for loop
		System.out.println("-------------");
		for (int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("-------------");
		
		//generics in arraylist
		// Student names:
		ArrayList<String> stNames = new ArrayList<String> ();
		
		stNames.add("Tom");
		stNames.add("Peter");
		stNames.add("Ravi");
		
		for (String e: stNames) {
			System.out.println(e);
		}
		
		System.out.println(stNames.size());
		
		System.out.println("-------------");
		
		ArrayList<Integer> stMarks = new ArrayList<Integer> ();
		stMarks.add(100);
		stMarks.add(300);
		
		System.out.println("-------------");
		
		//emp info:
		ArrayList<Object> empData = new ArrayList<Object> ();
		empData.add("Mukta");
		empData.add(25);
		empData.add(34.55);
		empData.add(true);
		empData.add('F');
		
		System.out.println(empData.size());
		System.out.println(empData);
		
		//for
		System.out.println("---------");
		for (int i = 0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
			if(empData.get(i).equals(true)) {
				System.out.println("eligible for hike");
			}
		}
		System.out.println("---------------");
		for (Object e:empData) {
			System.out.println(e);
		}
		
		

	}

}
