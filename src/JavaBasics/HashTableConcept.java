package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {


		Hashtable hs = new Hashtable();
		
		hs.put("A","Test");
		hs.put("B", "Hello");
		hs.put("C", "World");
		
		System.out.println(hs.size());
		
		hs.put(1, 200);
		hs.put(2, 200);
		
		System.out.println(hs.size());

		System.out.println(hs.get(2));
		System.out.println(hs.get("B"));
		
		hs.put(3, "Tom");
		
		//if i want to restrict the Key and value in HashTable so.... 
		Hashtable<Integer,Integer> hs1 = new Hashtable<Integer,Integer>();
		hs1.put(1, 400);
		
		//If i want to restrict key and values in HashTable so....
		Hashtable<Integer,String> hs2 = new Hashtable<Integer,String>();
		hs2.put(2, "World");
	}

}
