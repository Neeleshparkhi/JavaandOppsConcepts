package OOPsConcept3;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
     ArrayList ar = new ArrayList();
     
     ar.add(100); //0
     ar.add(200);//1
     ar.add(300);//2
     
     System.out.println(ar.size());
     
     ar.add(400);//3
     ar.add(500);//4
     
     System.out.println(ar.size());
     
     ar.add(600);//5
     ar.add("Tom");//6
     ar.add(12.33);//7
     ar.add('A');//8
     ar.add(600);//9
     
     System.out.println(ar.size());
     
     ar.remove(9); //Remove method
     
     System.out.println(ar.size());
     
     System.out.println(ar.get(4));
     
     //to print all the value of ArrayList:- for loop
     
     for(int i=0;i<ar.size(); i++) {
    	 System.out.println(ar.get(i));
     }
     
     //if i want to restrict array list with only integer value then
     
     ArrayList<Integer> ar1 = new ArrayList<Integer>();
	 
     ar1.add(100);
     //ar1.add("Tom") //this is not allowed
     
     ArrayList<String> ar2 = new ArrayList<String>();
     
     ar2.add("Neelesh");
     //ar2.add(100); //this is not allowed
     
	}

}
