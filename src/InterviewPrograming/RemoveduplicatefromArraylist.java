package InterviewPrograming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicatefromArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Array.add(10);
		Array.add(20);
		Array.add(30);
		Array.add(50);
		Array.add(60);
		Array.add(20);
		
		System.out.println(Array);
		
		Set<Integer> hs = new LinkedHashSet<Integer>(Array);
		
		Array.clear();
		
		Array.addAll(hs);
		
		System.out.println(Array);

	}

}
