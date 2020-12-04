package OOPConceptPart1;

public class Car {
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new car:- This is the object of Car class
		//new keyword is use to create the object
		//a,b,c---Object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod = 2012;
		c.wheel = 4;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		//Shifting on object reference from one object to another object
		
		a = b;
		b = c;
		c = a;
		
		b.mod = 10;
		System.out.println(b.mod);
		c.mod = 20;
		System.out.println(c.mod);
		System.out.println(a.mod);
		
		
		

	}

}
