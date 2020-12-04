package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Global vars: the scope of global variables will be available across all the functions with same condition  
	
	String name = "Tom"; //Non-static global variable
	static int age = 25; //Static global variable

	public static void main(String[] args) {
		
	//how to call static method and var?
	//1. Direct calling:
	Sum();
	//2. Calling by className
	StaticAndNonStaticConcept.Sum();
	
	//How to call non static methods and var?
	StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
	obj.SendMail();
	System.out.println(obj.name);
		
    //Can i access Static method by using object reference? Yes
	obj.Sum(); //warning will be given, but this is not good practice.
	
	}
	
	public void SendMail() {//non static method
		System.out.println("Send mail method");
	}

	public static void Sum() {//Static method
		System.out.println("Sum Method");
		
	}
}
