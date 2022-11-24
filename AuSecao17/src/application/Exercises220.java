package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ListaProd;

public class Exercises220 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ListaProd> list = new ArrayList<>();
		
		System.out.println("Enter file path");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
//		System.out.println(sourceFolderStr);
		
		boolean success = new  File(sourceFolderStr + "\\out").mkdir();
		
//		System.out.println("create created:" + success);
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv" ; 
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
		
			String itemCsv = br.readLine();
			while(itemCsv != null) {
			
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new ListaProd(name, price, quantity));
				
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for (ListaProd item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				} 
				
				System.out.println(targetFileStr + " CREATED");
				
			}catch (Exception e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
			
			
			
		}catch(IOException e){
			System.out.println("Error writing file: " + e.getMessage());
		}
		
		sc.close();
	}

}




//C:\Users\lucca.macedo\Desktop\Lucca\apoioAulasUdemy\Java\Seçao 17 - Arquivos\activity.csv