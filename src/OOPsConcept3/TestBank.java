package OOPsConcept3;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_Bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationloan();
		hs.carloan();
		
		//dynamic polymorphism:
		//Child class object can be refferd by parent interface reference variable
		
		USBank us = new HSBCBank();
        us.credit();
        us.debit();
        us.transferMoney();
	}

}
