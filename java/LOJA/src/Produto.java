package entities;

public class Produto {
	
	private String codigo;
	private String descricao;
	private double valorUnitario;
	private int qtdeEstoque;
	
	public Produto(String codigo, String descricao, double valorUnitario) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
	}

	public String getCodigo() {
		return codigo;
	}

	/*public void setCodigo(String codigo) {
		this.codigo = codigo;
	}*/

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	/*public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}*/
	
	public void incluirEstoque(int valorSerIncluido) {
		this.qtdeEstoque += valorSerIncluido;
	}
	
	public void retirarEstoque(int valorSerExcluido) {
		if(qtdeEstoque >= valorSerExcluido) {
			this.qtdeEstoque -= valorSerExcluido;
		} else {
			System.out.println("Valor indisponível...");
		}
		
	}
	

}
