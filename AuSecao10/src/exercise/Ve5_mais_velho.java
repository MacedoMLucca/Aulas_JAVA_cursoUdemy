package exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Ve5_velho;

public class Ve5_mais_velho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos pessoas voce vai digitar? ");
		int n = sc.nextInt();
		Ve5_velho[] vect = new Ve5_velho[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da "+(i+1)+" pessoa:");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade ");
			int idade = sc.nextInt();
			vect[i] = new Ve5_velho(nome,idade);
		}
		int maioridade = vect[0].getIdade();
		String velho = "";
		for (int i = 0; i < vect.length; i++) {
			
			
			if (vect[i].getIdade() > maioridade) {
				maioridade = vect[i].getIdade();
				velho = vect[i].getNome();
				
				
			}else {
				
			}
			
			System.out.printf("PESSOA MAIS VELHA: " + velho);
			
		}
		
		sc.close();
	}

}


























