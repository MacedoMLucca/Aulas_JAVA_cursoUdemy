package atividades.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class ExPoli162 {
	
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number of employees:");
		int i = sc.nextInt();
		
		
		List<Employee> listEmployee= new ArrayList<>(); 
		
		
		for (int j = 1; j <= i; j++) {
			
			System.out.println("Employee #"+j+" data:");
			System.out.println("Outsourced (y/n)?");
			String decisao = sc.next().toLowerCase();
			
			System.out.print("Name:");
			String name = sc.next();
			System.out.print("Hours:");
			int hours = sc.nextInt();
			System.out.print("Value per hour:");
			double valHour = sc.nextDouble();
			
			if(decisao.equals("n")) {			
				Employee n = new Employee(name,hours,valHour);
				listEmployee.add(n);
			}else {
				System.out.print("Additional charge:");
				double addCharge = sc.nextDouble();				
				Employee y = new OutsourcedEmployee(name,hours,valHour,addCharge);
				listEmployee.add(y);
			}
		
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee e : listEmployee) {
			System.out.println(e.getName()+ " - $ "+ e.payment() );
		}
		sc.close();
		
	}

}
