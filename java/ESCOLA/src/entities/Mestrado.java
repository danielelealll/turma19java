package entities;

public class Mestrado extends Estudante {
	
	private double creditoMestrado;

	public Mestrado(int matricula, String cpf, double creditoMestrado) {
		super(matricula, cpf);
		this.creditoMestrado = creditoMestrado;
	}

	public double getCreditoMestrado() {
		return creditoMestrado;
	}

	public void setCreditoMestrado(double creditoMestrado) {
		this.creditoMestrado = creditoMestrado;
	}
}
