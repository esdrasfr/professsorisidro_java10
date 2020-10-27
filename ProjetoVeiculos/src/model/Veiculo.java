package model;
/*  Classes abstratas, em termos teóricos são "MOLDES" para a criação de novos
 * tipos de dados (classes), porém não podem ter instância direta, ou seja,
 * 
 *   Veiculo v = new Veiculo(...)  não pode ser feito
 *   
 *   para que criamos então? Para ter uma forma genérica de nos referirmos a 
 *   elementos (tipos) específicos
 * 
 */
public abstract class Veiculo {
	protected String marca;
	protected String placa;
	
	public Veiculo(String marca, String placa) {
		super();
		this.marca = marca;
		this.placa = placa;
	}
	
	/* Outro uso bastante importante (e talvez o mais relevantes) para usarmos classes
	 * abstratas é criarmos uma "vinculação contratual" entre a classe pai e as filhas 
	 * através dos métodos abstratos.
	 * 
	 * Os métodos abstratos que declaramos na classe-pai DEVEM obrigatoriamente serem
	 * implementados (inseridos lógica) nas classes filhas
	 */
	
	public abstract void acelerar();
	public abstract void frear();
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	

}
