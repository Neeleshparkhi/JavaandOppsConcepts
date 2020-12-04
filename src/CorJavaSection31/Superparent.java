package CorJavaSection31;

public class Superparent {
	
	public Superparent()
	{
		System.out.println("I am parent class constructor");
	}

	String name = "Neelesh" ;
	public void Getdata()
	{
		int a = 10;
		System.out.println(a);
		System.out.println("I am in parent class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Superparent sp = new Superparent();
		sp.Getdata();
		
		
	}

}
