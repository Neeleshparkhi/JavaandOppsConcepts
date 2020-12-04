package TestPackageFinalKeyword;

public class FinalizeConcept {
	
	//before the garbage collector (gc) finalize method will be called just to cleanup processing of the object
	public void finalize() {
		System.out.println("Finalized method");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}
