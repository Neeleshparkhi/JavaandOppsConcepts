package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> sh = new HashSet<String>();
		
		sh.add("Hello");
		sh.add("World");
		sh.add("He");
		sh.add("She");
		System.out.println(sh);
		
		System.out.println(sh.size());
		sh.add("World");
		System.out.println(sh);
		
		
		Iterator<String> i =sh.iterator(); //create the object of Iterator method.
		System.out.println(i.next());
		System.out.println(i.next());
		
	}

}
