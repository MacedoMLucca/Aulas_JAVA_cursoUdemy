package entities;

import entities.enums.Color;

public class Retangle extends Shape {

	private Double width;
	private Double height;
	
//	CONTRUTORES
	public Retangle() {	
		super();
	}
	public Retangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

//	GET e SET	
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	//----------
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
//	METODO
	@Override
	public double area() {
		return width*height;
	}
	
}
