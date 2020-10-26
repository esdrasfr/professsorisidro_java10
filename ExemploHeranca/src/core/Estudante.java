package core;
// aqui o operador "extends" pode ser lido da seguinte forma:
// o tipo de dado ESTUDANTE AMPLIA a definição do tipo PESSSOA

// ou seja: Estudante TEM TUDO O QUE TEM EM Pessoa E MAIS ALGUMA COISA
public class Estudante extends Pessoa{
	private String curso;
	private int    numeroMatricula;
	
	
	// aqui a funcionalidade "exibirInfo" é a mesma que existe na classe-pai
	// como o nome da funcionalidade é o mesmo, não chamamos de "sobrecarga" e sim de "sobrescrita" do método
	@Override
	public void exibirInfo() {
		System.out.println("Nome: "+nome+" / "+email+ " ("+telefone+") "+numeroMatricula+"/"+curso);
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getNumeroMatricula() {
		return numeroMatricula;
	}


	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	
}
