package OOPsConcept3;

public interface USBank {
	
	int min_Bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration
	//no method body--only method prototye
	//in interface we can declare the variable, variable are by default static in nature
	//vars value will not be changed, its final/contant in nature
	//no static method in interface	
	//no main method in interface
	//we can not create the object in interface
	//interface is abstract in nature

}
