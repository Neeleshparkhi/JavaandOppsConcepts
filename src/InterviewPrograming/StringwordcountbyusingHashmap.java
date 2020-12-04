package InterviewPrograming;

import java.util.HashMap;

public class StringwordcountbyusingHashmap {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi this is java programing";
		String[] split = str.split(" ");
		
		HashMap<Integer, String> hs =new HashMap<Integer, String>();
		for(int i=0 ; i<split.length;i++ )
		{
			if(hs.containsKey(split[i]))
			{
				//programing is not completed.
				
			}
		}
		

	}

}
