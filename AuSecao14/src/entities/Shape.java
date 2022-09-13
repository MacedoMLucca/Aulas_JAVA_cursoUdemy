package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
//	CONSTRUTORES
	
	public Shape() {
	}
	public Shape(Color color) {
		this.color = color;
	}

//  GET e SET
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}

//	METODO
	public abstract double area();

	
	
	
	
	
}
