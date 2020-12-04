package Constructor;

public class ConstructorWithThisKeyword {

	String name;
	int age;
	
		
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name = name; //class variable can be initialized with "this" key word
		this.age = age;
		
		
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	public static void main(String[] args) {
	ConstructorWithThisKeyword con = new ConstructorWithThisKeyword("Tom" , 30);

	}

}
