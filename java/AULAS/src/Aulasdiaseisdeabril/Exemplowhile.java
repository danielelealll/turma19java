package Aulasdiaseisdeabril;

import java.util.Scanner;

public class Exemplowhile {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		System.out.println("Entre com a sua idade:");
		idade = entrada.nextInt();
		
		while(idade>=1) {
			System.out.printf("Sua idade: %d", idade);
			
			if(idade>=18) {
				System.out.printf("\nvocê é de maior...");
						
			}
			else {
				System.out.printf("\nvocê é de menor...");
			}
			System.out.println("Entre com a sua idade:");
			idade = entrada.nextInt();
		}
	}

}
