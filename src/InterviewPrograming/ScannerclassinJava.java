package InterviewPrograming;

import java.util.Scanner;

public class ScannerclassinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your name: - ");
		String s =scan.next();
		System.out.println("Enter you age:- ");
		int i = scan.nextInt();
		System.out.println("Enter you Salary :- ");
		double d = scan.nextDouble();
		
		System.out.println("Your Name is  " + s);
		System.out.println("Your Age is "+ i);
		System.out.println("Your Salary is " + d);
		
	}

}
