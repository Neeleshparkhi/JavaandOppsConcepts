package OOps;

public class Classinterface implements Interfacelearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfacelearning a =new Classinterface();
		a.getdata();
		a.senddata();
		a.recevedata();

	}

	@Override
	public void getdata() {
		// TODO Auto-generated method stub
		
		System.out.println("Data is comming from the machine");
		
	}

	@Override
	public void senddata() {
		// TODO Auto-generated method stub
		System.out.println("Data is sending from the machine");
		
	}

	@Override
	public void recevedata() {
		// TODO Auto-generated method stub
		System.out.println("Data is reciving by the machine");
		
	}

}
