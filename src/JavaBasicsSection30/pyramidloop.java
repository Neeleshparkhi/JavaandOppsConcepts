package JavaBasicsSection30;

public class pyramidloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 5;
		
		for(int i=1; i<=row; ++i)
		{
			for(int j=1; j<=i; ++j)
			{
				 
				System.out.print("* ");
			}
		
			System.out.println();
		}
		
		
		int line = 5;
		
		for(int a=1;a<=line; ++a)
		{
			
			for(int b=1;b<=a;++b)
			{
				System.out.print(b);
			}
			System.out.println();;
		}
		
		int li = 5;
		int num = 10;
		
		for(int x=1 ;x<=(li-1); ++x  )
		{
			
			for (int y = li; y<= (num-3); ++y )
			{
				System.out.print(y + " ");
			}
			System.out.println(x + " ");
		}
		
		int k = 1;
		
		for(int j = 0; j<5; ++j)
		{
			
		
		
		for(int l = 1;l<5-j; ++l)
		{
			
			System.out.print( k + " ");
			k++;
		}
		System.out.println();
		
		}
		
		int z1=1;
		for(int x1=0; x1<5; x1++)
		{
			
			for(int y1=1; y1<5-x1;y1++)
			{
				System.out.print(z1+ " ");
				z1++;
			}
			
			System.out.println();
		}
		
		int c1=1;
		for(int a1=0; a1<5; a1++)
		{
			for(int b1=1; b1<5-a1;b1++)
			{
				System.out.print(c1+ " ");
				c1++;
			}
			System.out.println();
		}
	}
	

}
