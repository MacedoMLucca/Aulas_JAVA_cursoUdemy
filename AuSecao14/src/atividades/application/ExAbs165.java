package atividades.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Retangle;
import entities.Shape;
import entities.enums.Color;

public class ExAbs165 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> listShape = new ArrayList<>();
		
		
		System.out.print("Enter the number of shapes: ");
		int i = sc.nextInt();
		
		for (int j = 1; j <= i; j++) {
			System.out.println("Shape #"+j+" data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			String choice = sc.next().toLowerCase();
			System.out.print("Color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			
			if (choice.equals("r")) {
				System.out.print("Width:");
				double width = sc.nextDouble();
				System.out.print("Height:");
				double height = sc.nextDouble();
				
				listShape.add(new Retangle(color, width, height));
				
			} else {
				System.out.print("radius:");
				double radius = sc.nextDouble();
				
				listShape.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : listShape) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		
		sc.close();
	}
}
