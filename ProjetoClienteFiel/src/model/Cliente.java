package model;

public class Cliente {
	protected String nomeCliente;
	protected String email;
	protected double linhaCredito;
	protected double valorFatura;
	
	public Cliente(String nomeCliente, String email, double linhaCredito) {
		super();
		this.nomeCliente  = nomeCliente;
		this.email        = email;
		this.linhaCredito = linhaCredito;
		this.valorFatura  = 0.0;
	}
	
	public String exibirFatura() {
		return "---- FATURA DO CLIENTE :"+ nomeCliente+"\n"+
	           "     Linha de Credito R$ "+linhaCredito+"\n"+
	           "     Total Fatura     R$ "+valorFatura;
	}
	
	public void pagarFatura(double valor) {
		this.valorFatura -= valor;
	}
	
	public boolean comprar(double valor) {
		if (valor + this.valorFatura > this.linhaCredito) {
			return false;
		}
		else {
			this.valorFatura += valor;
			return true;
		}
	}

	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getLinhaCredito() {
		return linhaCredito;
	}

	public void setLinhaCredito(double linhaCredito) {
		this.linhaCredito = linhaCredito;
	}

	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}
	
	
	
	

}


