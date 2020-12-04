package InterviewPrograming;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//ArmStrong value is the values which brakes in cube of every brake. 
		//exp:- 153, brake is = 1+125+27 = 1^3+5^3+3^3
		int value = 152;
		int x = 0, y , test;
		
		test = value;
		
		while(value>0)
		{
			y=value%10;
			value=value/10;
			x=x+(y*y*y);
		}
		
		if(test==x)
		{
			System.out.println("Value is ArmStrong value");
		}
		else
		{
			System.out.println("Value is not ArmStrong value");
		}
	}

}
