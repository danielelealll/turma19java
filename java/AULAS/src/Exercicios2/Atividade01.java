package Exercicios2;

import java.util.Scanner;

public class Atividade01 {
	
	public  static  void  main ( String [] args ) {
		
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o seu primeiro n�mero: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o seu segundo n�mero: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o seu terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if (n1> n2 && n1 > n3) {
			System.out.println("O primeiro n�mero digitado � o maior: " + n1);
			
		}
		else if (n2 > n1 && n2 > n3) {
			System.out.println("O segund n�mero digitado � o maior: " + n2);
		}
		else  if (n3 > n1 && n3 > n2) {
			System.out.println("O terc n�mero digitado � o maior: " + n3);
		}
		
		else {
			System.out.println( " Voc� n�o inseriu um n�mero corretamente, tente de novo " );
		}
	}
	

		
}
