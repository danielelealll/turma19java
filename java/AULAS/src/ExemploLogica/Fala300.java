package ExemploLogica;

import java.util.Scanner;

import java.util.Locale;

public class Fala300 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		String nome;
		
		char situacaoEmergencial; //nao esqueça o chart
		System.out.println("Digite seu nome: ");
		nome = leia.next() .toUpperCase();
		
		System.out.println("Você recebeu o auxílio emergencial antes? S-SIM ou N-NÃO: ");
		situacaoEmergencial = leia.next() .toUpperCase().charAt(0);
		
		if(situacaoEmergencial == 'S') {
			System.out.printf("Você recebeu algum auxílio extra como Bolsa família S-sim ou N-não:");
			situacaoEmergencial = leia.next() .toUpperCase().charAt(0);
			if (situacaoEmergencial =='S') {
				System.out.println("Infelizmente você não pode recebero auxílio emergencial!!");
				
			}
			
			else if (situacaoEmergencial =='N') {
				
				System.out.println("Você é chefa de família S-sim ou N-não");
			}
		}
	}

}
