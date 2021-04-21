package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Conta contaPoupança = new Conta(1001, "401.676.758-00");
		Conta contaCorrente = new Conta(1020, "401.676.758-00");
		
		System.out.println("Digite o numero da conta: ");
		contaPoupança.numero = leia.nextInt();
		System.out.println("Digite o CPF: ");
		contaPoupança.cpf = leia.next();
		System.out.println("Operação de 1-Credito ou 2-Debito: ");
		char opcao = leia.next().charAt(0);
		System.out.println("Qual valor: ");
		double valor = leia.nextDouble();
		
		if(opcao == '1') {
			contaPoupança.credito(valor);
		} else if(opcao == '2') {
			contaPoupança.debito(valor);
		}
		
		System.out.printf("CPF do cliente: %s", contaPoupança.cpf);
		System.out.printf("\nNumero da conta: %d", contaPoupança.numero);
		System.out.printf("\nCPF do cliente: %.2f", contaPoupança.saldo);
		
		

	}

}
