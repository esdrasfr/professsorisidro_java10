package model;

public class Motoca extends Veiculo{
	
	private String tipo;

	public Motoca(String marca, String placa, String tipo) {
		super(marca, placa);
		this.tipo = tipo;
	}
	
	public void acelerar() {
		System.out.println("Moto "+marca+" acelera na mão! PROPRORPROPORPORPORPRO");
	}
	public void frear() {
		System.out.println("Moto "+marca+" freia no pé! CRRRAAZZZZZZZZZZ");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
