package ExemploLogica;

import java.util.Scanner;

public class exemploGeneration {
	


		public static void main (String[] args) {
			
			Scanner ler = new Scanner (System.in);
			
			int idade;
			String nome;
			
			System.out.printf("Digite o seu nome: ");
			nome = ler.nextLine();
			
			System.out.printf("Digite a sua idade: ");
			idade = ler.nextInt();
			
			System.out.printf("Seu nome: '%s', nome ");
			System.out.printf("Sua idade: '%d', idade");
			
			if(idade>=18) {
				
				System.out.printf("Voc? ? maior de idade");
				
			}
			
			else {
				
				System.out.printf("Voc? ? menor de idade!");
			}
				
		}

	}



