package exercicios; //nome do pacote onde a classe está inserida

import java.util.Scanner; //biblioteca que contém as instruções e função de leitura;

public class Media { // public class = classe public e "Media" nome da classe

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // Intância o recebimento de entrada do usuário
		
		
		
		double nota1, nota2, nota3, media; //double = real em portugol;
		
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble(); //Pega a informação printada e associa a variação
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3; 
		
		System.out.printf("A sua média é: %.2f" , media); //Quando formato informação, uso vírgula ao invés do mais ( USAR PRINTF);
	}

}
