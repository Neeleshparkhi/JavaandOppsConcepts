package JavaBasicsSection30;

public class pyramidstructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1;
		for(int i=0; i<5 ; i++)
		{
			for(int j=1 ; j<=i; j++)
			{
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		
		int b =1;
		for(int x= 0; x<5; x++)
		{
			for(int y =1; y<5-x; y++)
			{
				System.out.print(b + " ");
				b++;
			}
			System.out.println();
		}
	
		
		for(int x1=0;x1<5; x1++)
		{
			
			for(int y1=1;y1<=x1; y1++)
			{
				System.out.print(y1 + " ");
				
			}
			System.out.println();
		}
		
		int e1=3;
		for(int q1=0; q1<4; q1++)
		{
			for(int w1=1; w1<=q1; w1++)
			{
				System.out.print(e1 + " ");
				e1=e1+3;
			}
			System.out.println();
		}
	}
	

}
