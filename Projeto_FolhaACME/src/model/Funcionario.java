package model;

public abstract class Funcionario {
	protected String nome;
	protected int    numRegistro;
	
	// construtor, gettes e setters
	public Funcionario(String nome, int numRegistro) {
		super();
		this.nome = nome;
		this.numRegistro = numRegistro;
	}
	
	// obrigatoriamente o método abstrato calcularSalario
	public abstract double calcularSalario();
	public abstract String exibirRecibo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	

}
