// Java program to demonstrate the
// working of a HashMap

import java.util.*;
public class Hashmap_demo 
{
	public static void main(String args[])
	{
		// Creating HashMap and
		// adding elements
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
// put method is used to add element in hashmap ,it is predefined method
		hm.put(1, "Geeks");
		hm.put(2, "For");
		hm.put(3, "Geeks");
		hm.put(null, null);
		hm.put(5, null);
		hm.put(6, "bradon");
		hm.put(7, "amit");

		// Finding the value for a key
		System.out.println("Value for 1 is " + hm.get(1));

		// Traversing through the HashMap
		for (Map.Entry<Integer, String> e : hm.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
}
