package exercicios; //nome do pacote onde a classe est� inserida

import java.util.Scanner; //biblioteca que cont�m as instru��es e fun��o de leitura;

public class Media { // public class = classe public e "Media" nome da classe

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // Int�ncia o recebimento de entrada do usu�rio
		
		
		
		double nota1, nota2, nota3, media; //double = real em portugol;
		
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble(); //Pega a informa��o printada e associa a varia��o
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3; 
		
		System.out.printf("A sua m�dia �: %.2f" , media); //Quando formato informa��o, uso v�rgula ao inv�s do mais ( USAR PRINTF);
	}

}
