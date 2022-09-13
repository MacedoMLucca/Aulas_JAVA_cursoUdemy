package exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Ve3_pessoas;

public class Ve3_alturas {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas pessoas serao digitadas:");
		int n = sc.nextInt();
		Ve3_pessoas[] vect = new Ve3_pessoas[n];

//		System.out.println(vect.length);
		
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Idade:");
			int idade = sc.nextInt();
			System.out.print("Altura:");
			double altura = sc.nextDouble();
			
			vect[i] = new Ve3_pessoas(nome,idade,altura);
			
		}

//		media de altura e validação de idade
		double alturaTot = 0.0;
		int menorIdade = 0;
		for (int i = 0; i < vect.length; i++) {
			alturaTot += vect[i].getAltura();
			
			if(vect[i].getIdade()< 16) {
			menorIdade += 1;
			}
		}
		System.out.printf( "media de altura : %.2f%n" , alturaTot/vect.length);
		
		
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%" , ((double)menorIdade/vect.length) * 100);
		
		
//		maiores de 16 anos 
		for (int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade()< 16) {
				System.out.println("\nNome dos menores de 16 anos "+vect[i].getNome());
			}
		}
		sc.close();
		
	}

}
