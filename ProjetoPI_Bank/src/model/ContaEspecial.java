package model;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numeroConta, double saldo, double limite) {
		super(nomeTitular, cpf, numeroConta, saldo);
		this.limite = limite;
	}
	
	public boolean debitar(double valor) {
		if (valor > super.saldo + this.limite) {
			return false;
		}
		else {
			super.saldo = super.saldo - valor;
			return true;
		}
	}
	
	public String exibirInfo() {
		return "CONTA ESPECIAL:"+super.numeroConta+" - "+super.nomeTitular+"("+cpf+") R$ "+
	                             super.saldo + "   R$" + this.limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
