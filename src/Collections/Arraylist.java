package Collections;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Neelesh");
		a.add("World");
		System.out.println(a);
		a.add(0, "Start");
		System.out.println(a);
		System.out.println(a.contains("Neelesh")); //To check List contains
		System.out.println(a.indexOf("World")); //to get the index number of string
		System.out.println(a.contains("Neel")); //to get the array list contains string or not.
		
		
		
	}

}
