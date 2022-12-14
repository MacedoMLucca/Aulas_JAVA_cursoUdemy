package entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;

//	CONTRUTORES	
	public Individual(String name, Double anualIncome) {
		super(name, anualIncome);
	}
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	
//	GET e SET
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
//	METODO
	@Override
	public double tax() {

		if (getAnualIncome()< 20000.00) {
			return (getAnualIncome()*0.15) - (healthExpenditures*0.5);
		}else {
			return (getAnualIncome()*0.25) - (healthExpenditures*0.5);
		}
		
	}
	
	
}
