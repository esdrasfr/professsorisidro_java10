
public class Produto {

	private int id;
	private String descricao;
	private double preco;
	
	public int getId() {
		return id;
	}
	public void setId(int id) throws IsiException {
		if (id <= 0) {
			throw new IsiException("ID nao pode ser negativo ou zero");
		}
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) throws IsiException {
		if (descricao == null || descricao.length() == 0) {
			throw new IsiException("Descricao deve conter algum valor valido");
		}
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) throws IsiException {
		if (preco < 0) {
			throw new IsiException("Preco invalido para o produto!");
		}
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	
	
	
}
