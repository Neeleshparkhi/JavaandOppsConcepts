package JavaBasicsSection30;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[4];   //Single array
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		
		int b[] = {2,4,6,8};
		
		//System.out.println(a[1]);
		
		for(int i=0; i<4;i++)
		{
			//System.out.println(a[i]);
		}
		
		int c[][]=new int [2][3];
		c[0][0]= 3;
		c[0][1] =6;
		c[0][2] = 9;
		c[1][0] = 12;
		c[1][1] = 15;
		c[1][2] = 18;
		
		int d [][] = {{2,3,4}, {5,6,7}};
		
		for (int i=0; i<2; i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
			
		}
		
		
		
	}

}
