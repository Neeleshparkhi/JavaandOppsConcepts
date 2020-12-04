package JavaBasics;

public class StringConcatination {

	public static void main(String[] args) {
	
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double d= 12.13;
		double e = 11.12; 
		
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println("the value of a is:" +a);
		System.out.println("the value of b is:" +b);
		System.out.println("the addition of and b is :" +(a+b));
		
		System.out.print(x+y);
		System.out.println(x+y);

	}

}
