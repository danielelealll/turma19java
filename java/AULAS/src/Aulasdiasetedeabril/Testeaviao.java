package Aulasdiasetedeabril;

import java.util.Scanner;

import Aulasdiasetedeabril.Aviao;

public class Testeaviao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao1 = new Aviao();
		
		System.out.println("Digite a marca do avião: ");
		aviao1.marca = leia.next();
		System.out.println("Qual é a cia Aerea: ");
		aviao1.ciaAerea = leia.next();
		System.out.println("Qual é o tipo de aeronave: ");
		aviao1.tipo = leia.next();
		System.out.println("Tipo de vôo 1 - Nacional e 2 - Internacional: ");
		aviao1.nacionalInternacional = leia.next().charAt(0);
		
		System.out.printf("Informações sobre a aeronave: \n%s \n%s \n%s \n%s", aviao1.marca, aviao1.ciaAerea, aviao1.tipo, aviao1.tipoVoo());
		
	}

}
