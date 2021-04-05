package ExemploLogica;

import java.util.Scanner;

public class Logicaa {
	
	public static void main (String [] args) {
		//RECEBEU O AUXILIO ANTES
		//NÃO PODE TER RECEBIDO BOLSA FAMILIA
		//A CADA FILHO MAIS 50 REAIS
		//CHEFA DE FAMILIA GANHA O DOBRO
		//VALOR BASE 300 REAIS
		
		

		Scanner leia = new Scanner(System.in);
		char opcao1;
		char opcao2;
		char opcao3;
		int numeroFilhos;
		int somaFilhos;
		
		System.out.println("Você ja recebeu auxilio?\nS - sim\nN - Não");
		opcao1 = leia.next().toUpperCase().charAt(0);
		System.out.println("Você é chefa de familia?\nS - sim\nN - Não");
		opcao2 = leia.next().toUpperCase().charAt(0);
		System.out.println("Você recebeu bolsa familia?\nS - sim\nN - Não");
		opcao3 = leia.next().toUpperCase().charAt(0);
		System.out.println("Você tem filhos?\nQuantos?\nSe não tem filhos digite 0");
		numeroFilhos = leia.nextInt();
		
		if(opcao3 == 'S')
		{
			System.out.println("Você não tem direito ao auxilio");
		}
		else if(opcao1 == 'S' && opcao2 == 'S')
		{
			somaFilhos = 600 + (numeroFilhos*50);
			System.out.println("Você tem direito a receber "+somaFilhos);
		}
		else if(opcao1 == 'S' && opcao2 == 'N')
		{
			somaFilhos = 300 + (numeroFilhos*50);
			System.out.println("Você tem direito a receber "+somaFilhos);
		}
		else
		{
			System.out.println("você não tem direito aauxílio");
		}
			
