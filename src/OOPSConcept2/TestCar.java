package OOPSConcept2;

public class TestCar {

	public static void main(String[] args) {
  
   //Static polymorphism --compile time polymorphism
   BMW b =new BMW();
   b.start();
   b.stop();
   b.refuel();
   b.theftsafety();
   b.engine();//from Grand parent
   b.wheel();
   
   
   
  System.out.println("************"); 
  
   Car c = new Car();
   c.start(); //car---start
   c.stop(); //car---stop
   c.refuel(); //car--refuel
   
  
   System.out.println("**********");
   
   //Top casting
   Car c1 = new BMW(); //child class object can be reffred by parent class reference variable---dynamic polimorphism-->run time polymorphism 
   c1.start();         //(only and only over ridden methods(common methods) + parent class methods will be called dynamice poly )
   c1.stop();
   c1.refuel();
   c1.engine();//from parent class
   
   
   //Down casting ()
   BMW b1 = (BMW)new Car(); //Classcastexception error on run time
	}

	
}
