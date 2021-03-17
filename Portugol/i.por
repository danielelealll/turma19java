programa
{
	
	funcao inicio()
	{
		inteiro idadePessoa
		inteiro mesesIdade
		inteiro diasIdade
		inteiro totalDias
		
		

		escreva("Oi ", "Vamos descobrir quantos dias você viveu até hoje? Coloque sua idade: "  )
		leia(idadePessoa)
		escreva("Sua idade em meses é de: ")
		leia(mesesIdade)
		
		escreva("Sua idade em dias é de: ")
		leia(diasIdade)

		totalDias=idadePessoa*365 + mesesIdade*30 + diasIdade
		escreva("O total de dias vividos é de: ", totalDias, " dias" )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 454; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */