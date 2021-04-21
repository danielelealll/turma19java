package entities;

public class Loja {
	
	private String nome;
	private String cnpj;
	
	public Loja(String nome, String cnpj) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	/*public void setNome(String nome) {
		this.nome = nome;
	}*/

	public String getCnpj() {
		return cnpj;
	}

	/*public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}*/
	
	public double desconto(double valorTotalCompra) {
			return valorTotalCompra * 0.10;
	}
	
	public double jurosMais10(double valorTotalCompra) {
			return valorTotalCompra * 0.10;
	}
	
	public double jurosMais20(double valorTotalCompra) {
			return valorTotalCompra * 0.20;
	}
	
	public double imposto(double valorTotalCompra) {
		return valorTotalCompra * 0.09;
	}
}
