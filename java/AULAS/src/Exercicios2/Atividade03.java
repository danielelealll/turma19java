package Exercicios2;

import java.util.Scanner;

public class Atividade03 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int idade;
		
		System.out.println("Oi! Insira a sua idade: ");
		idade = ler.nextInt();
		
		if ((idade == 10) || (idade <= 14)) {
			System.out.println("Voc� est� na categoria infantil!");
		}
		
		else if ((idade == 15) || (idade <=17)) {
			System.out.println("Voc� est� na categoria juvenil!");
			
		}
		
		else if ((idade == 18) || (idade <=25)) {
			System.out.println("Voc� est� na categoria adulto!");
		}
		
		else {
			System.out.println("Voc� n�o digitou uma idade entre 10 a 25 anos, tente novamente! Se caso sua idade perpassar os 25, sinto muito, n�o temos uma categoria para voc�!");
		}
			
	}

}
