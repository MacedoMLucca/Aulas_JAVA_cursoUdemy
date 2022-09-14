package atividades.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ExFixacao166 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> listTax = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int i = sc.nextInt();
		
		for (int j = 1; j <= i; j++) {
			System.out.println("Tax payer #"+j+" data:");
			System.out.print("Individual or Company (i/c)? ");
			char choice = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (choice == 'i') {
				System.out.println("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				listTax.add(new Individual(name, anualIncome, healthExpenditures));
				
			} else {
				System.out.println("Number of employees: ");
				int numEmployees = sc.nextInt();
				listTax.add(new Company(name, anualIncome, numEmployees));				
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxPayer : listTax) {
			System.out.println(taxPayer.getName() + ": $ " +String.format("%.2f",taxPayer.tax()));
		}
		
		System.out.println();
		double sum =0.0;
		for (TaxPayer taxPayer : listTax) {
				sum +=taxPayer.tax();
		}
		System.out.println("TOTAL TAXES: $ " + sum);
		
		sc.close();
	}
}
