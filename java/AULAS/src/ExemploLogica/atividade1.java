package ExemploLogica;

import java.util.Scanner;

public class atividade1 {

}
public  static  void  main ( String [] args ) {
	
	Scanner ler = new Scanner (System.in);
	
	int n1, n2, n3;
	
	Sistema . para fora . print ( " Digite um n�meros: " );
	n1 = sc . nextInt ();
	
	Sistema . para fora . print ( " Digite mais um n�meros: " );
	n2 = sc . nextInt ();
	
	Sistema . para fora . print ( " Digite o ultimo n�meros: " );
	n3 = sc . nextInt ();
	
	if (n1 > n2 && n1 > n3)
	{
		
		Sistema . para fora . print ( " O numero maior � " + n1);
	}
	else  if (n2 > n3 && n2 > n1)
	{
		Sistema . para fora . print ( " O numero maior � " + n2);
	}
	else  if (n3 > n1 && n3 > n2)
	{
		Sistema . para fora . println ( " O numero maior � " + n3);
	}
	sen�o 
	{
		Sistema . para fora . println ( " voc� digitou valores inv�lidos. Por favor, tente novamemte !! " );
	}
	
	sc . Fechar();
}

}