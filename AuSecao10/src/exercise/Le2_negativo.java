package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Le2_negativo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		
		System.out.print("How many numbers you go enter:");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; i++) {
			System.out.println("Write a number:");
			list.add(sc.nextInt());
			
		}
		
//	para ver os itens retornando 
//		for (Integer x : list) {
//			System.out.println(x);
//		}
		
		System.out.println("NEGATIVE NUMBERS:");
		
		int numneg = 0 ;
		
		for (Integer x : list) {
			
			if (x < 0) {
				numneg += 1;
				System.out.println(x);
			}
		}
		if (numneg == 0 ) {
			System.out.println("Nos "+list.size()+" numeros que digitou não tiveram numeros negativos ");
		}
		
		

		sc.close();
	}
}
