package HashMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EcommLogin {

	// User role: seller, partner, dist, customer, vendor, admin, cat manager
	
	//Assignment
	//productMap : <name,price> <String, Double>

	public static String getUserCreds(String role) {

		Map<String, String> roleMap = new HashMap<String, String>();
		roleMap.put("seller", "seller@gmail.com;seller123");
		roleMap.put("partner", "partner@gmail.com;partner");
		roleMap.put("customer", "customer@gmail.com;customer123");
		roleMap.put("admin", "admin@gmail.com;admin123");
		roleMap.put("catmanager", "catmanager@gmail.com;catmanager123");

		return roleMap.get(role);

	}

	public static String getUserName(String role) {
		String creds = getUserCreds(role);
		return creds.split(";")[0];

	}

	public static String getPassword(String role) {
		String creds = getUserCreds(role);
		return creds.split(";")[1];
	}

	public static void main(String[] args) {
//
//		String creds = getUserCreds("seller");
//		System.out.println(creds);
		String un = getUserName("seller");
		String pwd = getPassword("seller");
		System.out.println(un + " " + pwd);

	}

}
