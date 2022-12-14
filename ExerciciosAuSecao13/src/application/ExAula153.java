package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client153;
import entities.Order153;
import entities.OrderItem153;
import entities.Product153;
import entities.enums.OrderStatus;

public class ExAula153 {
	
	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter com os dados do cliente:");
		System.out.print("Name:");
		String name = sc.next();
		System.out.print("Email:");
		String email = sc.next();
		System.out.print("birth Date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.next());
		
		Client153 client = new Client153(name, email, birthDate);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order153 order = new Order153(new Date(),status,client);
		
		System.out.print("How many items to this order?");
		int item = sc.nextInt();
		
		
		
		for (int i = 1; i <= item; i++) {
			System.out.println("Enter #"+ i +" item data:");
			System.out.print("Product Name: ");
			String productName = sc.next();
			System.out.print("Product Price: ");
			Double productPrice = sc.nextDouble();
			
			Product153 product = new Product153(productName, productPrice);
			
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem153 orderItem = new OrderItem153(quantity, productPrice, product);
			
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		
		sc.close();
	}
}
