package JavaBasicsSection30;

public class PrintAndMethod {

   static int a = 4;
   
   public int getdata()
   {
	   System.out.println("Get Data");
	   
	   return 2;
	   
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println(a);
		PrintAndMethod pm = new PrintAndMethod();
		Secongcalss sc = new Secongcalss();
		pm.getdata();
		sc.setdata();
		
		
		
	}

}
