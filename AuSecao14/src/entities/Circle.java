package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private Double radius;
	
//	CONSTRUTORES
	public Circle() {
		super();
	}
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

//	GET e SET
	public Double getRadius() {
		return radius;
	}
	public void setRadius(Double radius) {
		this.radius = radius;
	}

//	METODO
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
