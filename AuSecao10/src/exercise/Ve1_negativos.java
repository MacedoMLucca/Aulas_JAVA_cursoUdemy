package exercise;

import java.util.Locale;
import java.util.Scanner;

public class Ve1_negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.print("How many numbers you go enter:");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
//		System.out.println(vect.length);
		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Write a number:");
			vect[i] = sc.nextInt();
			
			
		}	
		
		
		System.out.println("NEGATIVE NUMBERS:");
		
		int numneg = 0 ; 
		for (int j = 0; j < vect.length; j++) {
			
			if (vect[j] < 0) {
				numneg += 1;
				System.out.println(vect[j]);
			}
			
		}
		if (numneg == 0 ) {
			System.out.println("Nos "+vect.length+" numeros que digitou não tiveram numeros negativos ");
		}

		
		
		sc.close();
	}

}
