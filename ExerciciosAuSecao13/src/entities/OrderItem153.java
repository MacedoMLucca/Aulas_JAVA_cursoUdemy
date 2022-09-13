package entities;

public class OrderItem153 {

	private Integer quantity;
	private Double price;
	
//	ASSOCIACAO
	private Product153 product;

//	CONSTRUTORES
	public OrderItem153() {
	}
	public OrderItem153(Integer quantity, Double price, Product153 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	

//	GET e SET
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
//	---------
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	---------
	public Product153 getProduct() {
		return product;
	}
	public void setProduct(Product153 product) {
		this.product = product;
	}
	
//	METODOS
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return product.getName() + " $"
					+String.format("%.2f", price)
					+", Quantity: "
					+ quantity 
					+", Subtotal: $"
					+String.format("%.2f", subTotal());
	}
}