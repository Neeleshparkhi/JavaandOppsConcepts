package InterviewPrograming;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHasmapwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Iterate HashMap values using While loop.
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(0, "Hello");
		map.put(1, "World");
		map.put(4, "Java");
		map.put(6, "Learning");
		
		Set se = map.entrySet();
		
		Iterator it = se.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry) it.next();
			System.out.print(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
