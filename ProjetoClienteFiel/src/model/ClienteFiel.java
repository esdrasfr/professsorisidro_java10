package model;

public class ClienteFiel extends Cliente {
	private double desconto;

	public ClienteFiel(String nomeCliente, String email, double linhaCredito, double desconto) {
		super(nomeCliente, email, linhaCredito);
		this.desconto = desconto;
	}

	public boolean comprar(double valor) {
		double novoValor = valor - valor * desconto/100;
		
		
		if (super.valorFatura + novoValor > super.linhaCredito) {
			return false;
		}
		else {
			super.valorFatura += novoValor;
			return true;
		}
		// return super.comprar(novoValor);
	}
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
