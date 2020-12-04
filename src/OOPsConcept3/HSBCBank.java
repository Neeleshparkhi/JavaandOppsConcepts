package OOPsConcept3;

public class HSBCBank implements USBank, BrazilBank { //we are achieving multiple inheritance
	//is-a relationship
	
	//is a class is implementing any method then its mandatory to define/override all the methods of interface
	//Below 3 methods are overriding from USBank
	public void credit() {
		System.out.println("hsbc----credit");
	}
	
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
	}
	
	//Separate method of HSBCBank
	public void educationloan() {
		System.out.println("hsbc---educationloan");
	}
	
	public void carloan() {
		System.out.println("hsbc---carloan");
	}
	
	//brazil bank method: overriding from BrazilBank
	public void mutulefund() {
		System.out.println("Brazil Bank---mutualfund");
	}

}
