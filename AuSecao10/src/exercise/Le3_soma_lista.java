package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Le3_soma_lista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Double> list = new ArrayList<>();
		
		System.out.println("How many numbers you go enter:");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Write a number:");
			double num = sc.nextInt();
			list.add(num);
		}
		
		double sum = 0.0;
		for (Double x : list) {
			sum += x;
		}
		
		System.out.println(sum);
		
		double avg = sum / list.size();
		
		System.out.print("VALORES = ");
		for (Double item : list) {
			System.out.print(" "+ item);
		}
		
		System.out.println("\nSOMA = "+ sum);
		System.out.println("MEDIA = "+avg);

		sc.close();
	}
}
