programa
{
	
	funcao inicio()
	{
		cadeia Joao
		real pesoTomate
		real excessoTomate
		real multaExcesso
		real valorliquiloPassado=4.0

		escreva("Oi João, insira aqui o peso de seus tomates que será calculado em quilos : " )
		leia(pesoTomate)

		se (pesoTomate>50)
		{
			escreva("João, insira quantos quilos a mais você ultrapassou de 50 quilos de tomate :")
			leia(excessoTomate)
			escreva("João,você pagará ", (4.0*excessoTomate), " R$ em multa por excesso de tomate!")
		}
		se (pesoTomate<=50)
		{
		escreva("Legal João, você não está com excesso de tomate e portanto a multa é de 0 reais!")
		}

	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */