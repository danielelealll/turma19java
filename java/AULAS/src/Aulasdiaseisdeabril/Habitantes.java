package Aulasdiaseisdeabril;

import java.util.Scanner;

public class Habitantes {
	
	public static void main (String [] args) {
		
		//a prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre
		//salario e numero de filhos. A orefeitura deseja saber:
		//A) media do salario da popula��o
		// b m�dia do n�mero de filhos
		// c percentual de pessoas com sal�rio at� 100,00
		
		//[para - enquanto] - fa�a enquanto - final
		
		// inicio
		
		// variaveis

		Scanner leia = new Scanner(System.in);
		
		final double HABITANTES= 2;
		double salario = 0.00;
		double numeroFilhos = 0;
		double mediaSalario=0.0;
		double totalSalario=0.0; // dentro do la�o
		double mediaFilhos=0.0;
		double totalFilhos=0.0;
		double maiorSalario=0.0;
		double percentualPessoasSalarioAte100=0.0;
		double contadorPessoasSalario100=0;
		
		// x++ = x = x+1
		// %s pega o valor da string
		// %d pega o valor do int
				
		for (int x=1; x<=HABITANTES; x++) {
			System.out.printf("Informe o sal�rio do habitante %d R$: ", x);
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
			
			// dentro do la�o
		}
		
		// fora do la�o
		
		mediaSalario = totalSalario / HABITANTES;
		mediaFilhos = totalFilhos / HABITANTES;
		
		System.out.printf("\nTotal dos sal�rios R$%.2f", totalSalario);
		System.out.printf("\nM�dia dos sal�rios R$%.2f", mediaSalario);
		System.out.printf("\nM�dia dos filhosR$%.2f ", mediaFilhos);
		// entradas
		// processamentoss
		// saidas
		// fim
	}

}
