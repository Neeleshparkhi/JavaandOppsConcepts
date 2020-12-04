package packagedemo;

import CorJavaSection31.Packagedemo;

public class demo {

	public void getdata()
	{
		System.out.println("I am from package demo package");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Packagedemo obj = new Packagedemo();
		obj.getdata();
		
		demo obj1 = new demo();
		obj1.getdata();
		
		
	}

}
