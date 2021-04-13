package Exerciciosdiaseisdeabril;

import java.util.Scanner;

public class Exerciciofor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero[] = new int[10];
		int par = 0, impar = 0;

		for (int x = 0; x < numero.length; x++) {
			System.out.println("Digite um numero: ");
			numero[x] = leia.nextInt();

			if (numero[x] % 2 == 0) {
				par++;

			} else if (numero[x] % 2 != 0) {
				impar++;

			}
		}

		System.out.println("Quantidade de numero pares: " + par);
		System.out.println("Quantidade de numeros ímpares: " + impar);
	}

}