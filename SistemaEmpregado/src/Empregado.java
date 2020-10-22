
public class Empregado {
	private String nome;
	private String cargo;
	private double salario;
	
	public void imprimir() {
		System.out.println("Nome: "+nome+" ("+cargo+")");
		System.out.printf("Salario R$ %.2f\n",salario);
		System.out.println("--------------------------------------------------");
	}
	
	public void aumentarSalario(double percentual) {
		this.salario = this.salario + this.salario * percentual / 100;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
