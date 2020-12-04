package CorJavaSection31;

public class Constructer{
	
	private String name;
	private int number;

	public Constructer()
	{
		System.out.println("I am constructer");
	}
	
	public Constructer(String str, int a)
	{
		this.name =str;
		this.number = a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructer ct = new Constructer();
		Constructer c = new Constructer("Neelesh" , 31);
		System.out.println("User Name :" + c.name + " Age : " + c.number );
  
	}

}
