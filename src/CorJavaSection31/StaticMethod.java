package CorJavaSection31;

public class StaticMethod {

	static int a = 10;
	static String name ;
	static int age ;
	static String City ;
	
	static 
	{
		name = "Neelesh";
		age = 31;
		City = "Jabalpur";
	}
	
	int b = 20;
	
	public static void getdata()
	{
		System.out.println(a);
		
	}
	
	public void thisdata()
	{
		System.out.println(this.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod obj = new StaticMethod();
		obj.thisdata();
		getdata();
		
	}

}
