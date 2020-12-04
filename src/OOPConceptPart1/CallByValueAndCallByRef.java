package OOPConceptPart1;

public class CallByValueAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
	
	CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
	int x = 10;
	int y = 20;
	obj.testsum(x, y); //call by value OR pass by value
	
	
	obj.p = 50;
	obj.q = 60;
	
	obj.swap(obj);
	//after swap
	System.out.println(obj.p);
	System.out.println(obj.q);

	}
	
	public int testsum(int a,int b) {
		int c= a+b;
		return c;
	}
	
	//call by refr
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p; //temp =50;
		t.p = t.q;// t.p = 60;
		t.q = temp;// t.q = 50
	}

}
