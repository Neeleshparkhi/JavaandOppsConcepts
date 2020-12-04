package Constructor;

public class ConstructorConcept {
	
   public ConstructorConcept() { //default constructor because no parameter is there 
	   System.out.println("Default const");
   }
   
   public ConstructorConcept(int i) { //one parameter is there
	   System.out.println("Single param constructor");
	   System.out.println("the value of i:" +i);
   }
   
   public ConstructorConcept(int i, int j) { //two parameter is there
	   System.out.println("two param constructor");
	   System.out.println("the value of i:" +i);
	   System.out.println("the value of j:" +j);
   }
	
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();	
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		

	}

}
