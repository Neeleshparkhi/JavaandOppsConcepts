package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap is something where any value stored with number and value.
		//with hashmap, you can store value in key/value pair, there is not necessary that
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(0, "Hello");
		hs.put(10, "World");
		hs.put(2, "HashMap");
		hs.put(3, "Electronics");
		hs.put(4, "Networking");
		
		System.out.println(hs.get(2));
		System.out.println(hs.get(4));
		
		//Now you can convert HashMap into the Set interface
		
	    Set sn=	hs.entrySet(); //entrySet is method which is use to convert data from HashMap to set
	    
	    Iterator it = sn.iterator();
	    
	    while(it.hasNext()) //for while loop we use hasNext() method
	    {
	    	//throug Map.Entry method we can get the data from HashMap to Set.
	    	Map.Entry mp =(Map.Entry)it.next(); //we are casting data like key and value with Map.Entry
	        System.out.println(mp.getKey());
	    	System.out.println(mp.getValue());  	
	    }
	}

}
