package ExemploLogica;

import java.util.Scanner;

public class atividade1 {

}
public  static  void  main ( String [] args ) {
	
	Scanner ler = new Scanner (System.in);
	
	int n1, n2, n3;
	
	Sistema . para fora . print ( " Digite um números: " );
	n1 = sc . nextInt ();
	
	Sistema . para fora . print ( " Digite mais um números: " );
	n2 = sc . nextInt ();
	
	Sistema . para fora . print ( " Digite o ultimo números: " );
	n3 = sc . nextInt ();
	
	if (n1 > n2 && n1 > n3)
	{
		
		Sistema . para fora . print ( " O numero maior é " + n1);
	}
	else  if (n2 > n3 && n2 > n1)
	{
		Sistema . para fora . print ( " O numero maior é " + n2);
	}
	else  if (n3 > n1 && n3 > n2)
	{
		Sistema . para fora . println ( " O numero maior é " + n3);
	}
	senão 
	{
		Sistema . para fora . println ( " você digitou valores inválidos. Por favor, tente novamemte !! " );
	}
	
	sc . Fechar();
}

}