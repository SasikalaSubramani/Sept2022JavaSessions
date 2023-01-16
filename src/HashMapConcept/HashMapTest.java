package HashMapConcept;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		//hash map --- data will be stored in key and value format
		//hashmap is a class
		//hash map does not maintains the order
		
		//
		
		
		HashMap<String, String> map = new HashMap<String,String>();
		
//		Map<String, String> map = new HashMap<String,String>();
//		Map<String, String> map = new LinkedHashMap<String,String>();//Stores data in Giver order
//		Map<String, String> map = new TreeMap<String,String>();//Stores data in sorted order
		
		map.put("Tom", "IBM");
		map.put("Peter", "MS");
		map.put("Ravi", "Google");
		map.put("Naveen", "CTS");
		map.put("Lisa", "Infosys");//Naveen's values get updated
		map.put("Aman", "Uber");
//		map.put("Naveen", "Infosys");
//		map.put(null, "XYZ");
//		map.put(null, "ABC");
//		map.put(null, null);
		map.put(null, "OLA");
		
		
		
		System.out.println(map.get("Peter"));
		System.out.println(map.get("TEST"));
		System.out.println(map.get("Naveen"));
		System.out.println(map.get("Aman"));
//		System.out.println(map.get(null));
		
//		to print all the values from hashmap:
		
		System.out.println(map);
		
		
	}

}
