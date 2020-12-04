package InterviewPrograming;

import java.util.ArrayList;
import java.util.Iterator;


public class ArraylistWhileForAdvanceforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add("20");
		list.add("30");
		list.add("40");
		
		System.out.println(list.size());
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("Advance for loop");
		for(Object obj : list)
		{
			System.out.println(obj);
		}
		

	}

}
