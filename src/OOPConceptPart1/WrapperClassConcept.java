package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+20);
		
		//Data conversion: String to int
		int i = Integer.parseInt(s);
		System.out.println(i+20);

		//String to double conversion:
		String x = "12.33";
		System.out.println(x+10);
		double d = Double.parseDouble(x);
		System.out.println(d+10);
		
		//String to boolean conversion
		String y = "true";
		boolean b = Boolean.parseBoolean(y);
		System.out.println(b);
		
		//int to string conversion
		int j = 200;
		System.out.println(j+30);
		
		String s1 = String.valueOf(j);
		System.out.println(s1+30); //20030
		
		String s2 = "100A";
		int i1 = Integer.parseInt(s2);
		System.out.println(i1); // NumberFormatException-- for input string: "100A"
	}

}
