package CorJavaSection31;

final class Finalkeyword {
	
	final void getdata()
	{
		System.out.println("Ia m final method");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int i = 10;
		
		int j = 20;
		
		Finalkeyword obj = new Finalkeyword();
		obj.getdata();
	}

}
