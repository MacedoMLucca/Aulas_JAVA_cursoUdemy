package exercise;

import java.util.Locale;
import java.util.Scanner;

import entities.Ve4_nota_Aprovado;

public class Ve4_aprovado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();
		Ve4_nota_Aprovado[] vect = new Ve4_nota_Aprovado[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do"+ (i+1) +"aluno:");
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Ve4_nota_Aprovado(nome,nota1,nota2);
			
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			if (     (  (vect[i].getNota1() + vect[i].getNota2()) / 2 >= 6.0)      ) {
				System.out.println(vect[i].getNome());
			}
		
			
		}

		sc.close();
	}

}
