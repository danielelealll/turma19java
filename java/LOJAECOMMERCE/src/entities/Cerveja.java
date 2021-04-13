package entities;

public class Cerveja extends Produto {
	
	private String marca;

	public Cerveja(String descricao, String codigo, double valorUnitario, int qtdeEstoque, String marca) {
		super(descricao, codigo, valorUnitario, qtdeEstoque);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	/*public void setMarca(String marca) {
		this.marca = marca;
	}*/
}