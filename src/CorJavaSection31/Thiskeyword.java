package CorJavaSection31;

public class Thiskeyword {
	
	public Thiskeyword ()
	{
		String name = "Neelesh";
		System.out.println("I am from constructor method");
		System.out.println(name);
	}

	int a = 3;
	
	public void getdata()
	{
		int a = 5;
		System.out.println(a);
		System.out.println(this.a);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thiskeyword tk = new Thiskeyword();
	    tk.getdata();
	    
	}

}
