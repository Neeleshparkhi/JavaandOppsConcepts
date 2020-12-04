package CorJavaSection31;

public class Superchild extends Superparent {

	String name = "TruBI";
	
	public Superchild()
	{
		super();
		System.out.println("I am child class Constructor");
	}
	
	public void getdata()
	{
		super.Getdata();// this is super keword with method
		System.out.println(name);
		//System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Superchild sc = new Superchild();
		sc.getdata();
		
	}

}
