package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> markList = new ArrayList<Integer>();
		System.out.println(markList.size());
		markList.add(100);
		markList.add(300);
		markList.add(450);
		markList.add(10);
		markList.add(600);
		markList.add(98);

		System.out.println(markList.get(5));

		markList.add(101);
//		markList.add(null);
		System.out.println(markList.get(6));

		System.out.println(markList);

		System.out.println(markList.size());

		markList.remove(3);
		System.out.println(markList.size());
		System.out.println(markList.get(3));

		markList.add(3, 1100);
		System.out.println(markList);

		markList.add(0, 1500);
		System.out.println(markList);
		System.out.println(markList.get(0));

		System.out.println("------------");
		System.out.println(markList);
		Collections.sort(markList);
		System.out.println(markList);

		Collections.swap(markList, 0, 1);
		System.out.println(markList);

		ArrayList<String> stNames = new ArrayList<String>();

		stNames.add("Tom");
		stNames.add("Peter");
		stNames.add("Ravi");
		stNames.add("Naveen");
		stNames.add("Mukta");
		
		Collections.sort(stNames);
		System.out.println(stNames);
		
		ArrayList<String> subNames = new ArrayList<String>();

		stNames.add("Java");
		stNames.add("Rython");
		stNames.add("Ruby");
		stNames.add("C#");
		stNames.add("GO");
		
		stNames.addAll(subNames);
		
		System.out.println(stNames);
		
		
		
		

	}

}
