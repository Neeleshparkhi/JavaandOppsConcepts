package CorJavaSection31;

public class Instancevariable {
	
	String name; //These are the instance variable
	String Address;
	static String City = "Jabalpur"; //If city values is constant then keep it as static.
	static int i = 0; //Different object sharing the same value.
	
	Instancevariable(String name, String Address)
	{
		
		this.name = name;
		this.Address = Address;
		i++;
		System.out.println(i);
		
	}
	
	public void getdata()
	{
		System.out.println(Address + " " + City);
		System.out.println();//now calling instance variable and static variable.
        i++;
	}
	
	public static void getstatic()
	{
	     System.out.println(City);  // in static method you can only call static or class variables.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instancevariable obj = new Instancevariable("Neelesh","Rampur");
		Instancevariable obj1 = new Instancevariable("Sushant","Ram Nagar");
		obj.getdata();
		obj1.getdata();
	}

}
