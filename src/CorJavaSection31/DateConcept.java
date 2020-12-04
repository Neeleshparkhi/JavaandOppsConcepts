package CorJavaSection31;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy HH:MM:SS");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}
