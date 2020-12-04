package InterviewPrograming;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Program for Prime number
		int num = 16;
		
		boolean flag = false;
		
		for(int i = 2; i<=num/2; ++i)
		{
			if( num % i ==0)
			{
				
				flag = true;
				break;
			}
		}
		if(!flag) 
           System.out.println(num +  " is a prime number");
		else
			System.out.println(num + " is not a prime number");
		
		//using while loop
		
	     int j = 2;
		
		while(j<=num/2)
		{
		
			if(num % j ==0)
			{
				flag = true;
				break;
			}
			++j;
		}
		if(!flag)
			System.out.println(num + " is a Prime number");
		else
			System.out.println(num + " Is not a prime number.");
 			
	}

}
