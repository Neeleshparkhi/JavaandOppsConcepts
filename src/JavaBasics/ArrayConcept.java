package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: to store similar data type values in a array variable 
		
		//1. int array
		//lowest bound/index = 0
		//unpper bound/index = n-1(n is size of array)
		//one dim(dimensional) array
		
		//Adv:- i can store multiple values in a single variable with similar data type
		//Dis-advantage of array:-
		//1. Size is fixed--Static array--To overcome this problem, we use collections--ArrayList, HashTable -- use Dynamic array
		//2. Stores only similar data types-- To overcome of this problem, we use object array.
		 
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);// will return 30 value
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); //size/length of array
		
		//print all the values of array: use for loop
		for(int j=0;j<i.length;j++) { 
			System.out.println(i[j]);
		}
		
		//2. double array
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 15.44;
		d[2] = 13.37;
		
		System.out.println(d[2]);	
		
		//3. char array:
		char c[] = new char[3]; 
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		
		System.out.println(c[1]);
		
		//4 boolean array:
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		System.out.println(b[1]);
		
		//5 String array:
		String s[] = new String[3];
		s[0] = "Hello";
		s[1] = "World";
		s[2] = "Good Morning";
		
		System.out.println(s.length);
		
		//6. Object Array:(Object is a class)-- is use to store different data types values
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 86.5;
		ob[3] = 'M';
		ob[4] = "7/8/1988";
		ob[5] = "London";
		
		for(int ab = 0; ab<ob.length; ab++){
			System.out.println(ob[ab]);
		}
		
		
		
	
			

	}

}
