package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		
		// key value pair, key unique, value not unique, hashing is used, only 1 null key, insertion order, null possible
		LinkedHashMap<Integer, String> empdetails = new LinkedHashMap<Integer, String>();
		empdetails.put(1, "Ashru");
		empdetails.put(2, "Isha");
		empdetails.put(3, "Faizi");
		empdetails.put(4, "Business");
		System.out.println(empdetails);

		HashMap<Integer, String> empdetailsall = new HashMap<Integer, String>();
		empdetailsall.putAll(empdetails);
		System.out.println(empdetailsall);		
		System.out.println(empdetails.keySet());
		System.out.println(empdetails.values());
		System.out.println(empdetails.entrySet());
		System.out.println(empdetails.containsKey(1));
		System.out.println(empdetails.containsKey(1));
	}

}
