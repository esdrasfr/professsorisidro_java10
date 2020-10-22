
public class Livro {
	private String  titulo;
	private String  autor;
	private int     anoPublicacao;
	private String  categoria;
	private int     posEstante;
	private int     posPrateleira;
	private boolean emprestado;
	
	public void exibirInfo() {
		System.out.println("Livro: "+titulo);
		System.out.println("     Autor: "+autor+" ("+anoPublicacao+")");
		System.out.println("     Categoria: "+categoria);
		System.out.println("     Localizacao: E: "+posEstante+" P:"+posPrateleira);
		if(emprestado) {
			System.out.println("     LIVRO EMPRESTADO");
		}
		else {
			System.out.println("     LIVRO DISPONÍVEL");
		}
		System.out.println("---------------------------------------------------------");
	}
	// na verdade estes 2 métodos substituem o setEmprestado(boolean emprestado)
	public void emprestar() {
		emprestado = true;
	}
	public void devolver() {
		emprestado = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosEstante() {
		return posEstante;
	}
	public void setPosEstante(int posEstante) {
		this.posEstante = posEstante;
	}
	public int getPosPrateleira() {
		return posPrateleira;
	}
	public void setPosPrateleira(int posPrateleira) {
		this.posPrateleira = posPrateleira;
	}
	public boolean isEmprestado() {
		return emprestado;
	}
	
}
