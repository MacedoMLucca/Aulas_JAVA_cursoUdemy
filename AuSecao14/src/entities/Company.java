package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
//	CONSTRUTORES
	public Company(String name, Double anualIncome) {
		super(name, anualIncome);
	}
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
//	GET e SET
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
//	METODO
	@Override
	public double tax() {
		if (numberOfEmployees>10) {
			return getAnualIncome()*0.14;
		} else {
			return getAnualIncome()*0.16;
		}
		
	}
	
}
