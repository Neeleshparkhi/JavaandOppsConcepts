package InheritanceAndPolymorphisim;

public class Testcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //Static polymorphism --compile time polymorphism
		   BMW b =new BMW();
		   b.start();
		   b.stop();
		   b.refuel();
		   b.theftsafety();
		   b.engine();//from Grand parent

		   System.out.println("************"); 
		   
		   Car c = new Car();
		   c.start(); //car---start
		   c.stop(); //car---stop
		   c.refuel(); //car--refuel
		   
		  
		   System.out.println("**********");

		Car c1 = new BMW();
		c1.engine();
	}

}
