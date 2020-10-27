package model;

public class Carro extends Veiculo {
	
	private String modelo;

	public Carro(String marca, String placa, String modelo) {
		super(marca, placa);
		this.modelo = modelo;
	}
	/* a classe carro, ao herdar de veículo, automaticamente está comprometida
	 * a implementar a lógica dos métodos abstratos definidos na superclasse
	 */
	public void acelerar() {
		System.out.println("Carro "+modelo+" acelera no pé! Vrummmmm!!!!");
	}
	public void frear() {
		System.out.println("Carro "+modelo+" freia na mão! iiiihhhhhhhhhc");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
