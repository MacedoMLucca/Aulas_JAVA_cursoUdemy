package exercise;

import java.util.Locale;
import java.util.Scanner;

public class Ve2_soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many numbers you go enter:");
		int n = sc.nextInt();
		double[] vect = new double[n];
			
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Write a number:");
			vect[i] = sc.nextInt();
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vect[i]);
	    }
		
		System.out.println("\nSOMA = "+ sum);
		System.out.println("MEDIA = "+avg);
		
		sc.close();
	}

}
