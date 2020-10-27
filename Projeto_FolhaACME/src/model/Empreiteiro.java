package model;

public class Empreiteiro extends Funcionario{

	private double valorEmpreita;
	
	public Empreiteiro(String nome, int numRegistro, double valorEmpreita) {
		super(nome, numRegistro);
		this.valorEmpreita = valorEmpreita;
	}
	
	@Override
	public String exibirRecibo() {
		// TODO Auto-generated method stub
		return "Recibo de Empreita: "+super.nome+"\n"+
			   "Valor da Empreita R$ "+this.valorEmpreita;
	}

	
	@Override
	public double calcularSalario() {
		return valorEmpreita;
	}

	public double getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(double valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}



	
	
}
