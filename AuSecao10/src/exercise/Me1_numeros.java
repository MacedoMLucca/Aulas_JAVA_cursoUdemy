package exercise;

import java.util.Scanner;

public class Me1_numeros {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		int[][] mat = new int[linha][coluna];
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}			
		}
		
		
		System.out.println("Digite o numero que deseja saber as posiçoes: ");
		int n = sc.nextInt();
		
		
		

		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == n) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		if (linha == coluna ) {
			System.out.println("Main diagonal:");
			for (int i=0; i<mat.length; i++) {
				System.out.print(mat[i][i] + " ");
			}
		}
		
		sc.close();
		
		
	}
}
