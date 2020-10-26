package core;

public class Pessoa {
	
	/*  o Protected é um modificador de acesso qu permite que apenas as 'CLASSES FILHAS' tenham
	 *  acesso aos atributos
	 */
	protected String nome;
	protected String email;
	protected String telefone;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void exibirInfo() {
		System.out.println("Nome "+nome+" / "+email+" ("+telefone+")");
	}

}
