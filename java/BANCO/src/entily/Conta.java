package entities;

public class Conta {
	
	public int numero;
	public String cpf;
	private double saldo;
	public boolean ativa;
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public Conta(int numero, String cpf, boolean ativa) {
		this.numero = numero;
		this.cpf = cpf;
		this.ativa = ativa;
	}
	
	public void debito(double valor) {
		saldo -= valor;
	}
	
	public void credito(double valor) {
		saldo += valor;
	}
}
