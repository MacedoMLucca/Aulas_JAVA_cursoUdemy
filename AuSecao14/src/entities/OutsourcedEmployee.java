package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
//	CONSTRUTORES
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

//	GET e SET
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}   
// METODOS
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
}
