package InterviewPrograming;

public class ArraySmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [][] = {{2,4,6},{4,5,6}, {1,3,9}};
		
		int min = abc[0][0];
		
		for(int i =0; i <3 ; i++)
		{
			for (int j = 0; j<3; j++)
			{
				if(abc[i][j]<min)
				{
					min= abc[i][j];
				}
			}
			
		}
		System.out.println(min);
	}

}
