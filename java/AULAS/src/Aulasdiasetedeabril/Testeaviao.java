package Aulasdiasetedeabril;

import java.util.Scanner;

import Aulasdiasetedeabril.Aviao;

public class Testeaviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		
		System.out.println("Digite a marca do avi�o: ");
		aviao1.marca = leia.next();
		System.out.println("Qual � a cia Aerea: ");
		aviao1.ciaAerea = leia.next();
		System.out.println("Qual � o tipo de aeronave: ");
		aviao1.tipo = leia.next();
		System.out.println("Tipo de v�o 1 - Nacional e 2 - Internacional: ");
		aviao1.nacionalInternacional = leia.next().charAt(0);
		
		System.out.printf("Informa��es sobre a aeronave: \n%s \n%s \n%s \n%s", aviao1.marca, aviao1.ciaAerea, aviao1.tipo, aviao1.tipoVoo());
		
	}

}
