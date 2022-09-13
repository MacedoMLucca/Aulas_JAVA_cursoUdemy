package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

//	CONSTRUTORES
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

//	GET e SET 
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
//	METODO
	public Double totalPrice() {
		return getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return getName() +"  $ "
			 + totalPrice() 
			 + "(Customs fee: $"
			 + customsFee + ")";
	}
}
