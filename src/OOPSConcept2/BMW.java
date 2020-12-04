package OOPSConcept2;

public class BMW extends Car {//*has a relationship*
	
	//When same method is present in parent class as well as in child calss with same name and same numbers of arguments, is called method overriding.
	public void start() {// overridden method
		System.out.println("BMW--Start");
	}
	
	public void theftsafety() {
		System.out.println("BMW--theftsafety");
	}

}
