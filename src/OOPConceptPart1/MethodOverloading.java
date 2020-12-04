package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
	}
	public static void main(int p) {
		
	}
	
    public static void main(int q, int r) {
		
	}
    // we can overload main method also.
    
    //you can not create method inside a method 
    //duplicate methods--> i.e. same method name with same number or arguments are not allowed 
    
	//Method overloading--> when the method name is same with different arguments or input parameter with different data types within the same class.
	public void sum() {
		
		System.out.println("SUM method-- zero param");
	}
	
	public void sum(int i) { //1 input param
		System.out.println("SUM method-- 1 input param");
		System.out.println(i);
	}
	
	public void sum(double d) { //1 input param
		System.out.println("SUM method-- 1 input param");
		System.out.println(d);
	}
	
	public void sum(int k,int l) {//2 input param
		System.out.println("SUM method-- 2 input param");
		System.out.println(k+l);
	}

}
