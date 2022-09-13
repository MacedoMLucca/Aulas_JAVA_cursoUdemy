package aulaMatriz;


import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[l][c];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}			
		}
		if (l == c ) {
			System.out.println("Main diagonal:");
			for (int i=0; i<mat.length; i++) {
				System.out.print(mat[i][i] + " ");
			}
		}
		
		System.out.println();
		
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
		
		
	}

}
