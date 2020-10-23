package core;

public class BombaDeCombustivel {
	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double totalPagar;
	
	public BombaDeCombustivel(String nome, double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;
	}
	
   public void abastecerPorLitros(double litros) {
		this.qtdeLitros = litros;
		this.totalPagar = this.qtdeLitros * this.precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.totalPagar = valor;
		this.qtdeLitros = this.totalPagar / this.precoLitro;
	}
	
	public String exibirRecibo() {
		String recibo;
		recibo = "========================================\n"+
		         "     IsidroCorp Gas & Energy            \n"+
				 "----------------------------------------\n"+
		         " Combustivel   : "+this.nome+"\n"+
				 " Preço Litro   : R$ "+String.format("%.3f", this.precoLitro)+"\n"+
		         " Quantidade    : "+String.format("%.3f", this.qtdeLitros)+"\n"+
				 " Total a Pagar : R$ "+String.format("%.2f", this.totalPagar)+"\n"+
		         "----------------------------------------";
		return recibo;  
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdeLitros() {
		return qtdeLitros;
	}

	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}
	
	
	
	

}
