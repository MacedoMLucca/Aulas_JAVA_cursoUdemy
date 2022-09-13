package atividades.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ExPoli163 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of employees:");
		int i = sc.nextInt();
		
		List<Product> listProd = new ArrayList<>(); 
		
		for (int j = 1; j <= i; j++) {
			System.out.println("Product #"+j+" data:");
			System.out.print("Common,used or import (c/u/i)?");
			String choice = sc.next();
				
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (choice.equals("i")) {

				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
			
				Product impProd = new ImportedProduct(name, price, customsFee);
				listProd.add(impProd);
				
			}else if (choice.equals("c")) {
				
				Product comProd = new Product(name, price);
				listProd.add(comProd);
				
			}else {

				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date manufacture = sdf.parse(sc.next());
			
				Product useProd = new UsedProduct(name, price, manufacture);
				listProd.add(useProd);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product prod : listProd) {
			System.out.println(prod.priceTag());
		}
		
		
		
		
		
		
		
		sc.close();
	}
}
