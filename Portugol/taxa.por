programa
{

	funcao inicio()
	{
		real PercDistribuidor
		real percImpostos
		real custoFabrica
		real totalConsumidor

		percImpostos=0.45
		PercDistribuidor = 0.28
		

		escreva("Olá, insira o custo de fábrica: ")
		leia(custoFabrica)

		escreva("O total de valor que o consumidor pagará é de: ",(custoFabrica + (0.28*custoFabrica)+(0.45*custoFabrica)) )
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */