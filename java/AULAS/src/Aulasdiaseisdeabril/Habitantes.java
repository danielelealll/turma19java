package Aulasdiaseisdeabril;

import java.util.Scanner;

public class Habitantes {
	
	public static void main (String [] args) {
		
		//a prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre
		//salario e numero de filhos. A orefeitura deseja saber:
		//A) media do salario da população
		// b média do número de filhos
		// c percentual de pessoas com salário até 100,00
		
		//[para - enquanto] - faça enquanto - final
		
		// inicio
		
		// variaveis

		Scanner leia = new Scanner(System.in);
		
		final double HABITANTES= 2;
		double salario = 0.00;
		double numeroFilhos = 0;
		double mediaSalario=0.0;
		double totalSalario=0.0; // dentro do laço
		double mediaFilhos=0.0;
		double totalFilhos=0.0;
		double maiorSalario=0.0;
		double percentualPessoasSalarioAte100=0.0;
		double contadorPessoasSalario100=0;
		
		// x++ = x = x+1
		// %s pega o valor da string
		// %d pega o valor do int
				
		for (int x=1; x<=HABITANTES; x++) {
			System.out.printf("Informe o salário do habitante %d R$: ", x);
			salario = leia.nextDouble();
			System.out.print("Informe a quantidade de filhos: ");
			numeroFilhos = leia.nextDouble();
			
			totalSalario = totalSalario + salario;
			totalFilhos = totalFilhos + numeroFilhos;
			
			if (maiorSalario < salario) {
				
				maiorSalario = salario;
			}
			if (salario <=100) {
				percentualPessoasSalarioAte100++;
			}
			
			// dentro do laço
		}
		
		// fora do laço
		
		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		
		System.out.printf("\nTotal dos salários R$%.2f", totalSalario);
		System.out.printf("\nMédia dos salários R$%.2f", mediaSalario);
		System.out.printf("\nMédia dos filhosR$%.2f ", mediaFilhos);
		// entradas
		// processamentoss
		// saidas
		// fim
	}

}
