package entities;

public class Pos extends Estudante {
	
	private double credito;

	public Pos(int matricula, String cpf, double credito) {
		super(matricula, cpf);
		this.credito = credito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
}
