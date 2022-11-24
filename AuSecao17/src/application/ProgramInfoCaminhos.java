package application;

import java.io.File;
import java.util.Scanner;

public class ProgramInfoCaminhos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath()); // Caminho completo
		System.out.println("getParent: " + path.getParent());// Apenas o caminho
		System.out.println("getName: " + path.getName());//Apenas nome do arquivo
		

		sc.close();
	}
}
