
public class UebiMotors {
	public static void main(String[] args) {
		// já que eu tenho o tipo Carro,
		// posso declarar variáveis deste tipo
		
		Carro c1, c2;
		
		// quando falamos de Classes, precisamos, antes
		// criar (reservar) o espaço de memória para ocupar
		
		c1 = new Carro();  // aqui estou ocupando a memória
		c2 = new Carro();
		
		c1.setMarca("Porsche");
		c1.setModelo("Cayenne");
		c1.setCor("Prata chumbo metalizado perolizado");
		c1.setAno(2020);
		c1.setPreco(1350000.0);
		
		c2.setMarca("Chevrolet");
		c2.setModelo("Corsa");
		c2.setCor("Prata com detalhes em branco e relevo");
		c2.setAno(1996);
		c2.setPreco(6200.0);
		
		
		c1.exibirAnuncio();
		double ipvaC1 = c1.calcularIPVA();
		System.out.println("Valor do IPVA do veiculo R$ "+ipvaC1);
		double parcelaC1 = c1.calcularParcelaFinanciamento(60);
		System.out.println("Parcela para financiamento 60x R$ "+parcelaC1);
		
		
		c2.exibirAnuncio();
		double ipvaC2 = c2.calcularIPVA();
		System.out.println("Valor do IPVA do veiculo R$ "+ipvaC2);
		double parcelaC2 = c2.calcularParcelaFinanciamento(18);
		System.out.println("Parcela para financiamento 18x R$ "+parcelaC2);
		
		
		
	}

}
