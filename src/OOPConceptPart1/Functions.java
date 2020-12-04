package OOPConceptPart1;

public class Functions {
    
	//
	public static void main(String[] args) {
		
	Functions obj = new Functions();
	//one object will be created, obj is object reference variable,referring to this object
	//after creating the object, the copy of all non static methods will be given to this object
	
	
	obj.test();
	
	int l = obj.PQR();
    System.out.println(l);		
    
    String s1 = obj.qa();
    System.out.println(s1);
    
    int d1= obj.division(4, 2);
    System.out.println(d1);
    
    //main method is void-- never returns a value
    }
	//3 types of functions and methods are there
	//non static methods
	
	//void -- does not return any value
	//return type = void
	public void test() { //no input, no output
		System.out.println("test method");
	}
	
	//return type = int
	public int PQR() { //no input,some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	// return type-- string
	public String qa() {//no input, some output
		System.out.println("qa method");
		
		String s = "Selenium";
		
		return s;
	}
	// return type-- int
	//x,y --input parameter/argument
	public int division(int x,int y){
		System.out.println("division method");
		int d=x/y;
		
		return d;
	}

}
