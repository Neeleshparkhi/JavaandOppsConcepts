package InterviewPrograming;

public class LargestvalueinRowThenlargestvalueincolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc [][] = {{2,4,6},{4,5,3}, {1,3,9}};
	    int max = abc[0][0];
	    int maxcolumn = 0;
	    
	    
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<3;j++)
	    	{
	    		if(abc[i][j]>max)
	    		{
	    			max = abc[i][j];
	    		   maxcolumn = j;
	    				
	    			}
	    		}
	    	}
	    int min = abc[0][maxcolumn];
	    int k = 0;
	    while(k<3)
	    {
	    	
			if(abc[k][maxcolumn]<min)
	    	{
	    		min = abc[k][maxcolumn];
	    		
				
	    	}k++;
	    	
			
	    }System.out.println("The Minimum value in Column is " + min);
	    
	 
		
	}

}
