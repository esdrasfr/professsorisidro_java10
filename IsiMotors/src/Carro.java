/* neste arquivo, vou apenas descrever - declarar - as variáveis 
 * (atributos) do meu novo tipo de dado que caracteriza um Carro
 * 
 * Declaro uma clase (estrutura) chamada Carro que é composta
 * dos seguintes atributos (variáveis): marca, modelo, cor, ano e preço
 * 
 * cada uma com seu respectivo tipo de dado (String, int, float)
 */
public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private int    ano;
	private double preco;
	
	
	
	void setMarca(String novaMarca){
		marca = novaMarca;  // o atributo "marca" recebe o que passamos no parâmetro "novaMarca"
	}
	String getMarca(){
		return marca;  // retorno o que está armazenado no atributo marca
	}
	
	void setModelo(String novoModelo) {
		modelo = novoModelo;
	}
	String getModelo() {
		return modelo; 
	}
	void setCor(String novaCor) {
		cor = novaCor;
	}
	String getCor() {
		return cor;
	}
	void setAno(int novoAno) {
		ano = novoAno;
	}
	int getAno() {
		return ano;
	}
	
	void setPreco(double novoPreco) {
		preco = novoPreco;
	}
	double getPreco() {
		return preco;
	}
	/* aqui criamos um método. O que é um método? Basicamente um 
	 * trecho de código que faz uma tarefa muito específica
	 * 
	 * todo método pode receber entrada de dados (através do que declararmos
	 * nos parêntesis) e também retornar algum resultado para ser atribuído
	 * em outra variável (seria a saída). Métodos que não retornam saída
	 * são declarados como VOID
	 */
	
	void exibirAnuncio(){
		// vou fazer vários PRINT das informações armazenadas nos atributos
		System.out.println("------------------------------------------------");
		System.out.println("Anuncio Carro: "+marca+" "+modelo);
		System.out.println("          Cor: "+cor);
		System.out.println("          Ano: "+ano+" Preço R$ "+preco);
		System.out.println("------------------------------------------------");
	}
	
	/* já o método calcularIPVA não precisa receber nenhuma informação
	 * adicional, entretanto ele retorna um valor que precisa ser
	 * atribuído a alguma variável na classe que o invocar
	 */
	double calcularIPVA(){
		double valorIPVA;
		if (ano <= 2000) {
			valorIPVA = 0;
		}
		else {
			valorIPVA = preco * 0.04;
		}
		return valorIPVA;
	}
	
	/* agora temos um método que além de retornar um valor, nos permite
	 * receber informação para que consigamos criar diferentes respostas
	 */
	double calcularParcelaFinanciamento(int numeroParcelas) {
		double valorParcela;
		valorParcela = (preco + (preco * 0.4))/numeroParcelas;
		return valorParcela;
		
	}
	

}
