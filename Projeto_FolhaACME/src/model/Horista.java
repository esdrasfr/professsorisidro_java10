package model;

public class Horista extends Funcionario {
	
	private int numHoras;
	private double valorHora;
	
	public Horista(String nome, int numRegistro, int numHoras, double valorHora) {
		super(nome, numRegistro);
		this.numHoras = numHoras;
		this.valorHora = valorHora;
	}

	@Override
	public String exibirRecibo() {
		return "Recibo de Pagamento de Horista: "+super.nome+"\n"+
	           "Horas Trabalhadas "+numHoras+"\n"+
			   "Valor da Hora     R$ "+valorHora+"\n"+
	           "Total a Pagar     R$ "+calcularSalario();
	}
	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora * numHoras;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	

}
