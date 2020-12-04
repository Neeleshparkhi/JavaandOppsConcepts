package InterviewPrograming;

import java.util.Scanner;

public class Palindrom {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String Palindrom
		/*String str = "MADAM";
		String st = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			st = st + str.charAt(i);
		}
		System.out.println("Reverse of MAD is " +st);
		if(st.equals(str))
			System.out.println("String is fully Palindrom");
		else
			System.out.println("String is not palindrom"); */
			
		
		//Intiger Palindrom
		
		int num = 120 , reverseinteger = 0, reverse, orignalInteger;
		orignalInteger = num;
		
		while(num !=0)
		{
			reverse = num % 10;
			reverseinteger = reverseinteger *10 + reverse;
			num = num/10;
		}
		if(orignalInteger==reverseinteger)
		{
			System.out.println( orignalInteger + " is Palindrome number");
		}
		
		else
		{
			System.out.println(orignalInteger + " Is not palindrome number");
		}
		
	

	
	}

}
