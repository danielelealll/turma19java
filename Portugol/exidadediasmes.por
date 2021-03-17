programa
{
	
	funcao inicio()
	{

	//objetivo
	//inicio
		//1 ano - 365 dias
		
		//variaveis - ingredientes
		inteiro idadeDias
		inteiro anos
		inteiro meses
		inteiro dias
		//entradas - o que vai chegar
		escreva("Digite a idade em dias totais: ")
		leia(idadeDias)
		//processamento - onde o negócio complica
		anos = idadeDias / 365
		meses = (idadeDias % 365) / 30
		dias = (idadeDias % 365) / 30
		
	
		//saída - mando para
		
		escreva("Ano[s]: ", anos)
		escreva("\nMes[es]: ", meses)
		escreva("\nDia[s]: ", dias)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */