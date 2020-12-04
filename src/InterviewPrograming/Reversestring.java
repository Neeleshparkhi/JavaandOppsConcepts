package InterviewPrograming;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Neelesh";
		//creating the object of StringBuild class for reversing the string
		StringBuilder st = new StringBuilder(str);
		//called reverse() method for reversing the string
		System.out.println(st.reverse());
		
		//reversing the String by converting the string into the char array.
		
		String str1 = "Hello World";
		//converting string into the array
		char chars[] =  str1.toCharArray();
		
		for(int i = chars.length-1; i>=0; i--)
		{
		 System.out.print(chars[i]);
		}
		
	}

}
