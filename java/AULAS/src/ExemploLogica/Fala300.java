package ExemploLogica;

import java.util.Scanner;

import java.util.Locale;

public class Fala300 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		String nome;
		
		char situacaoEmergencial; //nao esque�a o chart
		System.out.println("Digite seu nome: ");
		nome = leia.next() .toUpperCase();
		
		System.out.println("Voc� recebeu o aux�lio emergencial antes? S-SIM ou N-N�O: ");
		situacaoEmergencial = leia.next() .toUpperCase().charAt(0);
		
		if(situacaoEmergencial == 'S') {
			System.out.printf("Voc� recebeu algum aux�lio extra como Bolsa fam�lia S-sim ou N-n�o:");
			situacaoEmergencial = leia.next() .toUpperCase().charAt(0);
			if (situacaoEmergencial =='S') {
				System.out.println("Infelizmente voc� n�o pode recebero aux�lio emergencial!!");
				
			}
			
			else if (situacaoEmergencial =='N') {
				
				System.out.println("Voc� � chefa de fam�lia S-sim ou N-n�o");
			}
		}
	}

}
