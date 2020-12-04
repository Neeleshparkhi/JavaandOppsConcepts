package JavaBasicsSection30;

public class ArraySmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Smallest value in the array
		/*int abc [][] = {{2,4,6},{4,5,6}, {1,3,9}};
		
		int min=abc[0][0];
		
		for(int i=0; i<3; i++)
		{
			for (int j=0; j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min= abc[i][j];
				}
				
			}
			
		}

		System.out.println(min);*/
	
	//highest value in the array
	/*int xyz [][] = {{2,4,6},{4,5,6}, {1,3,9}};
	
	int max=xyz[0][0];
	
	for(int i=0; i<3; i++)
	{
		for (int j=0; j<3;j++)
		{
			if(xyz[i][j]>max)
			{
				max= xyz[i][j];
			}
			
		}
		
	}

	System.out.println(max); */
	
	//Find the Smallest value in the comlum and then find maximum number into the cloumn.
	
	int a[][]= {{2,3,1},{4,2,7},{9,12,17}};
	
	int min=a[0][0];
	int mincolumn = 0;
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			if(a[0][0]<min)
			{
				min=a[i][j];
				mincolumn = j;
			}
			
		}
		
		int max=a[0][mincolumn];
		int k = 0;
		
		while(k<3)
		{
			if(a[k][mincolumn]>max)
			{
				max=a[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
		
	}
	
}

}
