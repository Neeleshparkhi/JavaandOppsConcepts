package JavaBasics;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		//While loop:
		//Note:- While is is keyword so it should start with small letter.
		int i = 1; //initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i = i+1; //incremental or decremental
		}
		
		System.out.println("***********");
		
		// J++ means j = j+1
		//2. for loop
		
		for(int j=1; j<=10; j++) { //initialization, conditional, incremental
			System.out.println(j);
		}

	}

}
