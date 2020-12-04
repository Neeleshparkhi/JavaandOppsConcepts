package Constructor;

public class A {
	
	public A() {
		System.out.println("Parent class cons");
	}

	public A(int i) {
		System.out.println("Parent class cons with value of i:" +i);
	}
	
	public A(int k, int j) {
		System.out.println("Parent class cons with value of i:" +k);
		System.out.println("Parent class cons with value of j:" +j);
	}
}
