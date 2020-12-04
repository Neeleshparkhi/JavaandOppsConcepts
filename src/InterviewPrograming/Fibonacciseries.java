package InterviewPrograming;

import java.util.Scanner;



public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b=0;
		int c=1;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items");
		
		num = sc.nextInt();
		System.out.println("Fabiccon series of the number is");
		for(int i =0; i>=0;i++)
		{
			a=b;
			b=c;
			c=a+b;
			
			System.out.println(a + "");
		}
		
	}

}
