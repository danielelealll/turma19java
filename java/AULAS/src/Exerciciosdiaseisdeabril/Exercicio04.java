package Exerciciosdiaseisdeabril;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		final int LIMITE = 5;
		int idade = 0, contador = 1;
		char sexo = ' ', opcao = ' ';
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0,
				pessoasNervosasAcimaDe40Anos = 0;
		int pessoasCalmasMenos18Anos = 0;

		System.out.println("Se você deseja realizar a pesquisa, digite S para SIM e N, para Não:");
		char continua = leia.next().toUpperCase().charAt(0);

		while (continua == 'S' && contador <= LIMITE) {
			System.out.print("Informe sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1 - Feminino / 2 - Masculino / 3 - Outros: ");
			sexo = leia.next().charAt(0);
			System.out.print("Digite:\n1 - Se pessoa calma, 2- se pessoa nervosa, 3 - Se pessoa agressiva: ");
			opcao = leia.next().charAt(0);
			System.out.println("Se você deseja realizar a pesquisa, digite S para SIM e N, para Não:");
			continua = leia.next().toUpperCase().charAt(0);

		}

		if (opcao == '1') {
			pessoasCalmas++;
		}

		if (opcao == '2' && sexo == '1') {
			mulheresNervosas++;
		}

		if (opcao == '3' && sexo == '2') {
			homensAgressivos++;
		}

		if (opcao == '1' && sexo == '3') {
			outrosCalmos++;
		}

		if (idade >= 40 && opcao == '2') {
			pessoasNervosasAcimaDe40Anos++;
		}

		if (idade < 18 && opcao == '1') {
			pessoasCalmasMenos18Anos++;
		}

		contador++;

		System.out.println("Pessoas calmas: " + pessoasCalmas);
		System.out.println("Mulheres nervosas: " + mulheresNervosas);
		System.out.println("Homens agressivos: " + homensAgressivos);
		System.out.println("Opção outros que são calmos: " + outrosCalmos);
		System.out.println("Pessoas acima de 40 anos que são nervosas: " + pessoasNervosasAcimaDe40Anos);
		System.out.println("Pessoas com menos de 18 anos que são calmas: " + pessoasCalmasMenos18Anos);
		System.out.println("Fim do programa!");
	}

}
