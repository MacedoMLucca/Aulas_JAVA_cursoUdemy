package entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;
	
//	CONSTRUTORES
	public TaxPayer() {
	}
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
//	GET e SET	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//---------	
	public Double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
//	METODO
	public abstract double tax();
	
	
	
}
