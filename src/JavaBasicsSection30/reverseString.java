package JavaBasicsSection30;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Hello World";
		String b = "";
		
		for(int i = a.length()-1; i>=0 ; i--)
		{
			b = b + a.charAt(i);
		}
		System.out.println(b);
		
		System.out.println(b.toUpperCase());
	}
		
}
