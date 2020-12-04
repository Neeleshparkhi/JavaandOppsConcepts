package JavaBasicsSection30;



public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "JavaLearning";
		
		System.out.println(a.charAt(5));
		System.out.println(a.chars());
		System.out.println(a.codePointAt(2));
		System.out.println(a.indexOf("a"));
		System.out.println(a.concat(" is very easy")); // to add string
		System.out.println(a.endsWith("g"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[] = a.split("L");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		

	}

}
