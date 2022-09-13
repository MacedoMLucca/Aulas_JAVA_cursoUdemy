package entities;

public class Ve3_pessoas {
	
	private String nome;
	private int idade;
	private double altura;
	
	
	
	public Ve3_pessoas(String nome, int idade, double altura) {
	
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
//---------------
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
//---------------
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
//	public static double media(double altura) {
//		double alturaTot = 0.0;
//
//		return alturaTot =+ altura;
//	}
	
	public String toString() {
			return "\nNome: "+nome+", idade: "+idade+", altura: "+altura;
	}
	
	
}
