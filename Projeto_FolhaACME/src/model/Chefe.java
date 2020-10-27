package model;

public class Chefe extends Funcionario {
	private double salarioBase;
	private double adiconalFuncao;
	private double beneficioTerno;
	
	public Chefe(String nome, int numRegistro, double salarioBase, double adiconalFuncao, double beneficioTerno) {
		super(nome, numRegistro);
		this.salarioBase = salarioBase;
		this.adiconalFuncao = adiconalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	@Override
	public String exibirRecibo() {
		return "Recibo de pagamento de Chefe:"+super.nome+"\n"+
	           "Salario Base    R$ "+salarioBase+"\n"+
			   "Adicional Função "+adiconalFuncao+"%%\n"+
	           "Beneficio Terno R$ "+beneficioTerno+"\n"+
			   "Total a Pagar   R$ "+calcularSalario();
	}
	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase*adiconalFuncao/100 + beneficioTerno;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdiconalFuncao() {
		return adiconalFuncao;
	}

	public void setAdiconalFuncao(double adiconalFuncao) {
		this.adiconalFuncao = adiconalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}	

}
