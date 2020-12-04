package Constructor;

public class B extends A {
	
      public B() {
    	super(10); //is use to call parent class constructor and should be written in child class constructor and should be the first statement
	System.out.println("Child class cons");
   }
      
      public B(int K,int j) {
    	  super(K,j);
      }
  public static void main(String args[]) {
	  B obj = new B();
	  B obj1 = new B(20,30);
  }
  }

