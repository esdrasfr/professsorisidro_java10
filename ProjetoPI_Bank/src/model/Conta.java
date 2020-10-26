package model;

public class Conta{
	protected String nomeTitular;
	protected String cpf;
	protected int    numeroConta;
	protected double saldo;
	
	
	
	public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if (valor >= saldo) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public String exibirInfo() {
		return "CONTA:"+numeroConta+" - "+nomeTitular+"("+cpf+")  R$ "+saldo;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
