package OOps;

public class FunctionOverloading {

	public void accdetails(int a,int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void accdetails(int b)
	{
		System.out.println(b);
	}
	
	public void accdetails(String a)
	{
		System.out.println(a);
	}
	
	public void AccountHolders()
	{
		System.out.println("Parent class all Old Account holders list");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverloading fn = new FunctionOverloading();
		
		fn.accdetails(3, 4);
		fn.accdetails(2);
		fn.accdetails("HEllo World");
	}

}
