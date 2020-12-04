package OOps;

public class classinheritance extends Inheritanceclass {

	public void cardesign()
	{
		
		System.out.println("Car design properties is defined");
	}
	
	public void cartyre()
	{
		
		System.out.println("Car tyre properties is defined");
	}
	
	public void sunr()
	{
		
		System.out.println(Sunroof);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classinheritance ch = new classinheritance();
		ch.sunr();
		ch.engine();
		ch.color();

	}

}
